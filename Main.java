import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        lib.clearConsole();
        Scanner input = new Scanner(System.in);
        System.out.println("How many rows do your array have?");
        int rows = input.nextInt();
        lib.clearConsole();

        System.out.println("How many columns does your array have?");
        int columns = input.nextInt();
        lib.clearConsole();
        int[][] test = {{1, 2}, {3, 4}, {5, 6}};

        int[][] userArray = new int[rows][columns];
        int totalValues = rows * columns;
        int loopCount = 0;
        int rowAmt = 0;
        int colAmt = 0;
        while (loopCount < totalValues) {
            System.out.println("Numbers entered: " + loopCount + "/" + totalValues);
            System.out.print("Enter a number: ");
            int arrNum = input.nextInt();
            lib.clearConsole();
            if (colAmt == columns) {
                colAmt = 0;
                rowAmt++;
            }
            userArray[rowAmt][colAmt] = arrNum;
            colAmt++;
            
            
            loopCount++;
        }
        boolean programLoop = true;
        while (programLoop) {
            System.out.println("What would you like to do?\n1 -- Display Array\n2 -- Find largest number\n3 -- Display sum of a row\n4 -- Display sum of a column\n5 -- Display Transposed Array\n6 -- Exit");
            int programChoice = input.nextInt();
            lib.clearConsole();
            if (programChoice == 1) {
                displayArray(userArray);
                System.out.print("Enter any letter to continue...");
                String continu = input.next();
                lib.clearConsole();
            }
            else if (programChoice == 2) {
                findLargest(userArray);
                System.out.print("Enter any letter to continue...");
                String continu = input.next();
                lib.clearConsole();
            }
            else if (programChoice == 3) {
                displayArray(userArray);
                System.out.print("Enter number of row to add: ");
                int rowChoice = input.nextInt();
                
                displayRowSum(userArray, rowChoice);
                System.out.print("Enter any letter to continue...");
                String continu = input.next();
                lib.clearConsole();

            }
            else if (programChoice == 4) {
                displayArray(userArray);
                System.out.print("Enter number of column to add: ");
                int columnChoice = input.nextInt();
                
                displayColumnSum(userArray, columnChoice);
                System.out.print("Enter any letter to continue...");
                String continu = input.next();
                lib.clearConsole();

            }
            else if (programChoice == 5) {
                transpose(userArray);
                System.out.print("Enter any letter to continue...");
                String continu = input.next();
                lib.clearConsole();
            }
            else if (programChoice == 6) {
                programLoop = false;
                System.out.println("Goodbye!");
            }
        }
        
        
        

        
        
        
    } 

    public static void findLargest(int[][] array) {
        int biggest = array[0][0];
        int rowVal = 1;
        int colVal = 1;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                if (array[i][k] > biggest) {
                    biggest = array[i][k];
                    rowVal = i + 1;
                    colVal = k + 1;
                }
            }
            
        }
        System.out.println("The biggest number is: " + biggest + ", located at Row " + rowVal + ", Column " + colVal + ".");
    }

    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                System.out.print(array[i][k] + " ");
            }
            System.out.println("");
        }
    }
    public static void displayColumnSum(int[][] array, int column) {
        int colSum = 0;
        for (int i = 0; i < array.length; i++) {
            colSum += array[i][column - 1];
        }
        lib.clearConsole();
        System.out.println("The sum of all the numbers in column " + column + " equal to " + colSum + ".");
        
    }
    public static void displayRowSum(int[][] array, int row) {
        int rowSum = 0;
        for (int i = 0; i < array[row - 1].length; i++) {
            rowSum += array[row - 1][i];
        }
        lib.clearConsole();
        System.out.println("The sum of all the numbers in row " + row + " equal to " + rowSum + ".");
    }
    
    public static void transpose(int[][] array) {
        System.out.println("Original:");
        displayArray(array);
        
        int[][] transposedArray = new int[array[0].length][array.length];
        int col = 0;
        for (int k = 0; k < transposedArray.length; k++) {
            for (int i = 0; i < array.length; i++) {
                transposedArray[col][i] = array[i][col];             
            }
            col++;
        }
        
        System.out.println("\n\nTransposed array: ");
        displayArray(transposedArray);
    }
}
