public class Main {
    public static void main(String[] args){
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        l1.log("First message");
        l2.log("Second message");
        if(l1 == l2){
            System.out.println("Only one instance of Logger exists");
        } else {
            System.out.println("Different instances are found");
        }
    }
}
