public class lib {   
    public static void sleep(int milliseconds){
        try {  
        Thread.sleep(milliseconds);   
        }
        catch(InterruptedException ex) {    
            ex.printStackTrace();
        }    
    }
    


}
