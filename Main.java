import java.util.Scanner;


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
        System.out.print("What would you like to do?\n1 -- Number to Roman\n2 -- Roman to Number\n");
        int menuChoice = input.nextInt();
        lib.clearConsole();
        if (menuChoice == 1) {
            System.out.print("Enter a number (1 - 3999): ");
            int num = input.nextInt();
            lib.clearConsole();
            getNumeral(num, values);
        }
        
        else if (menuChoice == 2) {
            System.out.print("Enter a numeral (1 - 3999): ");
            String numeral = input.next();
            lib.clearConsole();
            getNumber(numeral, values);
        } 
        
        
        
        
        
        
        
    } 

    public static void getNumber(String num, Roman[] list) {
        int number = 0;
        for(int i = 0; i < num.length(); i++) {
            switch(num.charAt(i)) {
                case ('M'):
                if (i == 0) {
                    number+=1000;
                    
                }
                else {
                    if (num.charAt(i - 1) == 'C') {
                        number +=800;
                    }
                    else {
                        number += 1000;
                    }
                }
                break;
                
                case ('C'):
                if (i == 0) {
                    number+=100;
                    
                }
                else {
                    if (num.charAt(i - 1) == 'X') {
                        number +=80;
                    }
                    else {
                        number +=100;
                    }
                }
                break;

                case('D'):
                if (i == 0) {
                    number+=500;
                    
                }
                else {
                    if (num.charAt(i - 1) == 'C') {
                        number +=300;
                    }
                    else {
                        number +=500;
                    }
                }
                break;
                case('X'):
                if (i == 0) {
                    number+=10;
                    
                }
                else {
                    if (num.charAt(i - 1) == 'I') {
                        number +=8;
                    }
                    else {
                        number +=10;
                    }
                }
                break;
                case('L'):
                if (i == 0) {
                    number+=50;
                    
                }
                else {
                    if (num.charAt(i - 1) == 'X') {
                        number +=30;
                    }
                    else {
                        number += 50;
                    }
                }
                break;
                case('V'):
                if (i == 0) {
                    number+=5;
                    
                }
                else {
                    if (num.charAt(i - 1) == 'I') {
                        number +=3;
                    }
                }
                break;
                case('I'):
                number +=1;

                
                

            }
        }
        System.out.println(number);
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
