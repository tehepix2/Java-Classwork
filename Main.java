import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Roman I = new Roman("I", 1);
        Roman IV = new Roman("IV", 4);
        Roman V = new Roman("V", 5);
        Roman IX = new Roman("IX", 9);
        Roman X = new Roman("X", 10);
        Roman XL = new Roman("XL", 40);
        Roman L = new Roman("L", 50);
        Roman XC = new Roman("XC", 90);
        Roman C = new Roman("C", 100);
        Roman CD = new Roman("CD", 400);
        Roman D = new Roman("D", 500);
        Roman CM = new Roman("CM", 900);
        Roman M = new Roman("M", 1000);
        
        Roman[] values = {M, CM, D, CD, C, XC, L, XL, X, IX, V, IV, I};
        
        lib.clearConsole();

        Scanner input = new Scanner(System.in);
        System.out.print("What would you like to do?\n1 -- Roman to Number\n2 -- Number to Roman");
        int menuChoice = input.nextInt();
        lib.clearConsole();
        /*if (menuChoice == 1) {
            System.out.print("Enter a number (1 - 3999): ");
            int num = input.nextInt();
            lib.clearConsole();
            getNumeral(num, values);
        }
        else if (menuChoice == 2) {
            System.out.print("Enter a numeral (1 - 3999): ");
            String numeral = input.nextLine();
            lib.clearConsole();
            getNumber(numeral, values);
        } */
        
        String test = "You";
        
        
        
        
        
    } 

    public static void getNumber(String num, Roman[] list) {
        int number = 0;
        for(int i = 0; i < num.length(); i++) {
            switch(num.charAt(i)) {
                case ('M'):
                number+=1000;
                case ('CM'):
                number
                

            }
        }
    }
    public static void getNumeral(int num, Roman[] list) {
        
        
        
        for(Roman i: list) {
            int count = num / i.getVal();
            num = num % i.getVal();
            for(int k = 0; k < count; k++) {
                System.out.print(i.getName());
            }
        }
    }


}
