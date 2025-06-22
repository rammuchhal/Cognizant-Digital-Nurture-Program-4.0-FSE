public class Product {
    private int productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(int productId,String productName,int quantity,double price){
        this.productId=productId;
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }

    @Override
    public String toString(){
        return "[ Product id: "+productId+", Product Name: "+productName+", Quantity: "+quantity+", Price: "+price+" ] ";
    }

    int getProductId(){
        return productId;
    }
    void setProductId(int productId){
        this.productId=productId;
    }

    String getProductName(){
        return productName;
    }
    void setProductName(String productName){
        this.productName=productName;
    }

    int getquantity(){
        return productId;
    }
    void setquantity(int quantity){
        this.quantity=quantity;
    }

    double getprice(){
        return price;
    }
    void setprice(double price){
        this.price=price;
    }
}
