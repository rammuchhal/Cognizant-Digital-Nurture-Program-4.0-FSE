import java.util.*;

public class Order {
     int orderId;
     String customerName;
     int totalPrice;

    public Order(){}
    public Order(int orderId,String customerName,int totalPrice){
        this.orderId=orderId;
        this.customerName=customerName;
        this.totalPrice=totalPrice;
    }

    @Override
    public String toString(){
        return "[ OrderId: "+orderId+", CustomerName: "+customerName+", TotalPrice: "+totalPrice +" ]";
    }

    public void printArray(Order[] orders){
        for(Order o:orders){
            System.out.println(o.toString());
        }
    }

    public void bubbleSort(Order[] orders){
        int n=orders.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<(n-i-1);j++){
                if( (orders[j].totalPrice) > (orders[j+1].totalPrice) ){
                    Order temp=orders[j];
                    orders[j]=orders[j+1];
                    orders[j+1]=temp;
                }
            }
        }
    }

    public void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(orders, low, high);
            quickSort(orders, low, pivotIndex - 1);
            quickSort(orders, pivotIndex + 1, high);
        }
    }

    public int partition(Order[] orders, int low, int high) {
        int pivot = orders[high].totalPrice;  // pick last element as pivot
        int i = low - 1; // index of smaller element

        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice <= pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of products: ");
        int totalOrders=sc.nextInt();

        Order[] orders=new Order[totalOrders];

        for(int i=0;i<totalOrders;i++){
            System.out.print("Enter the orderId for orderNo. "+(i+1)+" : ");
            int orderId=sc.nextInt();

            System.out.print("Enter the customerName for orderNo. "+(i+1)+" : ");
            sc.nextLine();
            String name =sc.nextLine();

            System.out.print("Enter the totalPrice of orderNo. "+(i+1)+" : ");
            int price=sc.nextInt();

            orders[i]=new Order(orderId, name, price);
        }
        Order o=new Order();

        System.out.println("Array before bubble sort and quick sort :");
        o.printArray(orders);

        System.out.println();

        o.bubbleSort(orders);
        System.out.println("Array after bubble sort : ");
        o.printArray(orders);

        System.out.println();

        o.quickSort(orders, 0, (totalOrders-1));
        System.out.println("Array after quick sort : ");
        o.printArray(orders);


    }
}