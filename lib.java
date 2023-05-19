public class lib {   
    public static void sleep(int milliseconds){
        try {  
        Thread.sleep(milliseconds);   
        }
        catch(InterruptedException ex) {    
            ex.printStackTrace();
        }    
    }
    
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            println(a[i]);
        }
    }
    public static void print(double[] a) {
        for (int i = 0; i < a.length; i++) {
            println(a[i]);
        }
    }


    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void print(String a) {
        System.out.print(a);
    }
    public static void print(int a) {
        System.out.print(a);
    }
    public static void print(double a) {
        System.out.print(a);
    }
    public static void print(boolean a) {
        System.out.print(a);
    }
   
    public static void println(String a) {
        System.out.println(a);
    }
    public static void println(int a) {
        System.out.println(a);
    }
    public static void println(double a) {
        System.out.println(a);
    }
    public static void println(boolean a) {
        System.out.println(a);
    }
    

    
   
    
}
