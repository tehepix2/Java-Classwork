import java.util.Scanner;
import java.util.ArrayList;


class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      boolean programLoop = true;

      ArrayList<Account> accountList = new ArrayList<Account>();
      boolean hasAccount = false;

      while (programLoop) {
        System.out.println("Welcome to Alpha Finance Bank!");
        System.out.println("What would you like to do?\n1 -- Sign In\n2 -- Create Account\n3 -- Leave");
        int loginChoice = input.nextInt();
        lib.clearConsole();
        
        if (loginChoice == 1) {
          if (hasAccount == false) {
            System.out.println("You have not made an account yet!");
            lib.sleep(2000);
            lib.clearConsole();
          }
          else {

          }
        }
        else if (loginChoice == 2) {
          System.out.print("Create a Username: ");
          String user = input.nextLine();
          lib.clearConsole();
          System.out.print("Create a Password: ");
          String pass = input.nextLine();
          

        }
        else if (loginChoice == 3) {
          programLoop = false;
          System.out.println("You left Alpha Finance Bank.");
        }
        else {
          System.out.println("Invalid Input!");
          lib.sleep(2000);
          lib.clearConsole();
        }
      }


    } 
}
