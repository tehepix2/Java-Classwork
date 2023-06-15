public class lib {   
    
    //Adds a pause between lines of code to make the program run nicely
    public static void sleep(int milliseconds){
        try {  
        Thread.sleep(milliseconds);   
        }
        catch(InterruptedException ex) {    
            ex.printStackTrace();
        }    
    }
    
    //Clears the console
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
