import java.util.Scanner;

class Finance{

    private static Double calculateFutureValue(Double principal, int years, Double rate) {
       if(years==0) return principal;

       Double newPrincipalAmount=principal*(1+rate); 

       return calculateFutureValue(newPrincipalAmount, years-1, rate);
    }
    public static void main(String[] args) {
        System.out.println();
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        Double principal=sc.nextDouble();

        System.out.print("Enter the no of years: ");
        int years=sc.nextInt();

        System.out.print("Enter the growth rate(in Percentage): ");
        Double rate=sc.nextDouble();

        Double futureValue=calculateFutureValue(principal,years,rate*0.01);

        System.out.printf("The Future value: %.2f%n",futureValue);

    }

    
}