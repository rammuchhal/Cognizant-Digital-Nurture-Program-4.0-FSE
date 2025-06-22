
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTest {
    private List<Product> products;

    public ProductTest(){
        products=new ArrayList<>();
    }

    //add at the end O(1)
    void addProducts(Product product){
        products.add(product);
    }

    //update a product O(n)
    String updateProduct(int productId,String productName,int quantity,double price){
        for(Product p:products){
            if(p.getProductId()==productId){
                p.setProductName(productName);
                p.setquantity(quantity);
                p.setprice(price);

                System.out.println("Product with id "+productId+" is updatd.");
                return p.toString();
            }
        }
        return "Product with productId "+productId+" is not found.";
    }


    //remove a product O(n)
    String deleteProduct(int productId){
        for(Product p:products){
            if(p.getProductId()==productId){
                Product productDeleted = p;
                products.remove(p);
                return "Product deleted : "+productDeleted;
            }
        }
        return "Product to be deleted is not found";
    }

    //accessing all Products
    void getAllProducts(){
        for(Product p:products){
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        ProductTest inventory= new ProductTest();
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of products to add to Inventory: ");
        int productsInInventory=sc.nextInt();
        System.out.println();

        for(int i=0;i<productsInInventory;i++){
            System.out.println("Enter the details of ProductId :"+(i+1));

            System.out.print("Enter the product name: ");
            String name=sc.next();

            System.out.print("Enter the product quantity: ");
            int quantity=sc.nextInt();

            System.out.print("Enter the product price: ");
            double price=sc.nextDouble();
            System.out.println();

            inventory.addProducts(new Product((i+1), name, quantity, price));
        }

        System.out.println("Products before update :");
        inventory.getAllProducts();
        System.out.println();

        System.out.print("Enter the product's productId to update: ");
        int updateProduct=sc.nextInt();

        System.out.print("Enter the updated product name for productId "+updateProduct +": ");
        String name=sc.next();
    

        System.out.print("Enter the updated product quantity for productId "+updateProduct+": ");
        int quantity=sc.nextInt();

        System.out.print("Enter the updated product price for productId "+updateProduct +": ");
        double price=sc.nextDouble();

        System.out.println(inventory.updateProduct(updateProduct, name, quantity, price));
        System.out.println();

        System.out.println("Products after update :");
        inventory.getAllProducts();

        System.out.println();

        System.out.println("Products before deletion of a product :");
        inventory.getAllProducts();

        System.out.print("Enter the product's productId that needs to be deleted : ");
        int prodId=sc.nextInt();
        System.out.println(inventory.deleteProduct(prodId));
        
        System.out.println();
        
        System.out.println("Products after deletion of a product :");
        inventory.getAllProducts();

    }
}
