import java.util.Scanner;

public class TestSingleton {
    public static void main(String[] args) {
        System.out.println();
        
        Logger log1=Logger.getInstance();
        Logger log2=Logger.getInstance();
        Logger log3=Logger.getInstance();

        log1.log("This is first log instance and its hashCode is "+log1.hashCode());
        log2.log("This is second log instance and its hashCode is "+log2.hashCode());
        log3.log("This is third log message and its hashCode is "+log3.hashCode());

        if(log1==log2 && log2==log3) System.out.println("All log instances are same");
        else System.out.println("The instances are not same");
    }
}
