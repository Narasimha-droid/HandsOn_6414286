// Exercise 1
public class Logger {
    private static Logger logger = new Logger();
    private Logger(){
        System.out.println("Logger Class");
    }
    public static Logger getInstance(){
        return logger;
    }
}

class Test{
    public static void main(String[] args){
        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();

        if(obj1==obj2){
            System.out.println("Single Instance");
        }
        else{
            System.out.println("Multiple Instance");
        }
    }
}