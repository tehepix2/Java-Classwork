import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        lib.clearConsole();
        Scanner input = new Scanner(System.in);

        boolean programLoop = true;
        while (programLoop) {
            System.out.print("Enter a number: ");
            double numChoice = input.nextDouble();
            lib.clearConsole();
            System.out.print("Enter its exponent: ");
            int powChoice = input.nextInt();
            lib.clearConsole();
            System.out.print(exp(numChoice, powChoice));
            lib.sleep(3000);
            lib.clearConsole();
        }
    } 

    public static double exp(double number, int power) {
        if (power == 0) {
            return 1;
        }
        else {
            return number * exp(number, power - 1);
        }
    }
    
}
