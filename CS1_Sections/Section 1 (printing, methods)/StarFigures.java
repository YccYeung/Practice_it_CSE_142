public class StarFigures{
    public static void main(String args[]){
        
        pattern();
        blank();
        pattern();
        num5();
        num5();
        blank();
        num1();
        num1();
        num1();
        pattern();
        
    }
    public static void pattern(){
        System.out.println("*****");
        System.out.println("*****");
        System.out.println(" * * ");
        System.out.println("  *  ");
        System.out.println(" * * ");
    }
    
    public static void num1(){
        System.out.println("  *  ");
    }
    
    public static void num5(){
        System.out.println("*****");
    }
    public static void blank(){
        System.out.println(" ");
    }
}
