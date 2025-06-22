public class Logger{
    private static Logger instance;
    
    //this will not be accessed outside of this class
    private Logger(){

    }

    //this method is used to create object rather than constructor
    public static Logger getInstance(){
        if(instance==null) instance=new Logger();
        return instance;
    }

    public void log(String message){
        System.out.println("Log: "+message);
    }

}