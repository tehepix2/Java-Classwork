import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        lib.clearConsole();
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        System.out.print("Enter a number: ");
        int numNums = input.nextInt();
        int[] numArray = new int[numNums];
        lib.clearConsole();
        
        for (int i = 0; i < numNums; i++) {
            System.out.println("Numbers entered: " + i + "/" + numArray.length);
            System.out.print("Enter a number: ");
            int numChoice = input.nextInt();
            numArray[i] = numChoice;
            lib.clearConsole();
        }
        
        System.out.println("All prime numbers:");
        printArray(PrimeDirective(numArray));
        
    } 

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] PrimeDirective(int[] array) {
        int primeCounter = 0;
        int numFactors = 0;
        for (int i:array) {
            for (int k = 1; k < i + 1; k++) {
                if (i%k == 0) {
                    numFactors++;
                    
                }
                
            }
            if (numFactors <= 2) {
                primeCounter++;
                
            }
            numFactors = 0;
        }
        int[] primeNumbers = new int[primeCounter];
        int arrayCounter = 0;
        for (int i:array) {
            for (int k = 1; k < i + 1; k++) {
                if (i%k == 0) {
                    numFactors++;
                    
                }
                
            }
            if (numFactors <= 2) {
                primeNumbers[arrayCounter] = i;
                arrayCounter++;
                
            }
            numFactors = 0;
        }

        return primeNumbers;
    }
}
