import java.util.*;

class Product{
    Integer productId;
    String productName;
    String category;

    Product(Integer productId,String productName,String category){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
    }

    @Override
    public String toString() {
        return " [ProductId: "+productId+" ,ProductName: "+productName+" ,Category: "+category+"]";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the number of products:");
        int products=sc.nextInt();
        sc.nextLine();

        int count=0;
        Product[] productsArray = new Product[products];

        while (count<products) {
            System.out.print("Enter the product id for product "+(count+1)+": ");
            int productId=sc.nextInt();
            sc.nextLine();

            System.out.print("Enter the product Name for product "+(count+1)+": ");
            String name=sc.nextLine();

            System.out.print("Enter the product Category for product "+(count+1)+": ");
            String category=sc.nextLine();

            Product product=new Product(productId,name,category);
            productsArray[count]=product;
            count++;
        }

        
        System.out.print("Enter the product ID that needs to be searched: ");
        int toSearch=sc.nextInt();
        sc.nextLine();

        //linear Search
        String productFoundLinear = linearSearch(productsArray,toSearch);
        if(productFoundLinear==""){
            System.out.println("Product not found in Linear Search");
        }
        else{
            System.out.println("The product found using Linear Search is: "+productFoundLinear);
        }
        
        Arrays.sort(productsArray, (a, b) -> Integer.compare(a.productId, b.productId));


        //Bineary Search
        String productFoundBinary = binarySearch(productsArray,toSearch);
        if(productFoundBinary==""){
            System.out.println("Product not found in Binary Search");
        }
        else{
            System.out.println("The product found using Binary Search is: "+productFoundBinary);
        }
        sc.close();
    }

    private static String linearSearch(Product[] productsArray, int target) {
        int n=productsArray.length;
        for(int i=0;i<n;i++){
            if(productsArray[i].productId==target) return productsArray[i].toString();
        }

        return "";
    }

    private static String binarySearch(Product[] productsArray, int target) {
        int start=0,end=productsArray.length-1;
        int mid=start+(end-start)/2;

        while(start<=end){
            if(productsArray[mid].productId==target){
                return productsArray[mid].toString();
            }
            else if(productsArray[mid].productId<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return "";
    }
}