import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


class Main {
    public static void main(String[] args) {
      lib.clearConsole();
      int access = -1;
      Scanner input = new Scanner(System.in);
      boolean programLoop = true;

      ArrayList<Account> accountList = new ArrayList<Account>();
      ArrayList<CheckingAccount> checkingList = new ArrayList<CheckingAccount>();
      ArrayList<SavingsAccount> savingsList = new ArrayList<SavingsAccount>();
      boolean hasAccount = false;

      while (programLoop) {
        System.out.println("Welcome to Alpha Finance Bank!");
        System.out.println("What would you like to do?\n1 -- Sign In\n2 -- Create Account\n3 -- Password Manager\n4 -- Leave");
        int loginChoice = input.nextInt();
        lib.clearConsole();
        
        if (loginChoice == 1) {
          if (hasAccount == false) {
            System.out.println("You have not made an account yet!");
            lib.sleep(2000);
            lib.clearConsole();
          }
          else {
            System.out.println("Login");
            System.out.print("Username: ");
            String userCheck = input.next();
            System.out.print("Password: ");
            String passCheck = input.next();
            for(int i = 0; i < accountList.size(); i++) {
              if (userCheck.equals(accountList.get(i).getUser()) && passCheck.equals(accountList.get(i).getPass())) {
                access = i;
                accountList.get(i).unlock();
                lib.sleep(2000);
                lib.clearConsole();
                break;
              }
              else {
                System.out.println("Username or password is incorrect.");
                lib.sleep(2000);
                lib.clearConsole();
              }
            }

            if (access != -1) {
              boolean accessLoop = true;
              while (accessLoop) {
                System.out.println("Welcome, " + checkingList.get(access).getName());
                System.out.println("What would you like to do?");
                System.out.println("Checking Account: " + checkingList.get(access).getBalance());
                System.out.println("Savings Account: " + savingsList.get(access).getBalance());
                System.out.println("Savings Interest Rate: " + savingsList.get(access).getInterest());
                System.out.println("1 -- Deposit Money\n2 -- Withdraw money\n3 -- Send money\n4 -- Add money to savings\n5 -- Change password\n6 -- Logout");
                int accountMenu = input.nextInt();
                lib.clearConsole();
                savingsList.get(access).interest();
                if (accountMenu == 1) {
                  System.out.println("How much money will you deposit?");
                  double addMoney = input.nextDouble();
                  checkingList.get(access).addMoney(addMoney);
                  lib.clearConsole();
                  System.out.println("Deposited $" + addMoney + ".");
                  lib.sleep(2000);
                  lib.clearConsole();
                }
                else if (accountMenu == 2) {
                  System.out.println("How much money will you withdraw?");
                  double subtractMoney = input.nextDouble();
                  lib.clearConsole();
                  if(checkingList.get(access).getBalance() >= subtractMoney) {
                    checkingList.get(access).takeMoney(subtractMoney);
                    lib.clearConsole();
                    System.out.println("Withdrew $" + subtractMoney + ".");
                    lib.sleep(2000);
                    lib.clearConsole();
                  }
                  else {
                    System.out.println("Not enough money!");
                    lib.sleep(2000);
                    lib.clearConsole();
                  }
                  
                }
                else if (accountMenu == 3) {
                  System.out.println("Who would you like to send money to?");
                  for(int i = 0; i < checkingList.size(); i++) {
                    System.out.println((i + 1) + " -- " + checkingList.get(i).getUser());
                  }
                  int personChoice = input.nextInt();
                  lib.clearConsole();
                  System.out.println("Sending money to: " + checkingList.get(personChoice - 1).getName());
                  System.out.print("How much money would you like to send? : ");
                  double moneySent = input.nextDouble();
                  checkingList.get(access).sendMoney(moneySent, checkingList.get(personChoice - 1));
                  lib.clearConsole();
                  System.out.println("Sent $" + moneySent + "to " + checkingList.get(personChoice - 1).getName() + "!");
                  lib.sleep(2000);
                  lib.clearConsole();

                }
                else if (accountMenu == 4) {
                  System.out.print("How much money would you like to add to savings? :");
                  double moneySentS = input.nextDouble();
                  checkingList.get(access).sendMoney(moneySentS, savingsList.get(access));
                  lib.clearConsole();
                  System.out.println("Added $" + moneySentS + " to savings!");
                  lib.sleep(2000);
                  lib.clearConsole();
                }
                else if (accountMenu == 5) {
                  System.out.print("Choose a new password: ");
                  String newPass = input.next();
                  lib.clearConsole();
                  accountList.get(access).setKey(newPass);
                  lib.sleep(2000);
                  lib.clearConsole();
                }
                else if (accountMenu == 6) {
                  accountList.get(access).lock();
                  lib.sleep(2000);
                  lib.clearConsole();
                  accessLoop = false; 
                }
              }
              

            }
          }
        }
        else if (loginChoice == 2) {
          hasAccount = true;
          System.out.println("Account Creation");

          System.out.print("Create a Username: ");
          String user = input.next();

          System.out.print("Create a Password: ");
          String pass = input.next();
          lib.clearConsole();

          System.out.print("Create a name for your savings account: ");
          String savName = input.next();
          lib.clearConsole();

          System.out.print("Create a name for your checking account: ");
          String checkName = input.next();
          lib.clearConsole();

          accountList.add(new Account(user, pass));
          savingsList.add(new SavingsAccount(user, pass, 0.0, savName, new Random().nextInt(10 - 5 + 1) + 5));
          checkingList.add(new CheckingAccount(0, user, pass, checkName));
          System.out.println("Username: " + user);
          System.out.println("Password: " + pass);
          lib.sleep(2000);
          lib.clearConsole();   
        }
        else if (loginChoice == 3) {
          if (hasAccount == false) {
            System.out.println("You have no accounts!");
            lib.sleep(2000);
            lib.clearConsole();
          }
          else {
          for(int i = 0; i < accountList.size(); i++) {
            System.out.println("Username: " + accountList.get(i).getUser());
            System.out.println("Password: " + accountList.get(i).getPass());
            System.out.println();
          }
          System.out.println("Enter anything to continue...");
          String thing = input.next();
          lib.clearConsole();
        }
        }
        else if (loginChoice == 4) {
          programLoop = false;
          System.out.println("You left Alpha Finance Bank.\nThanks for using Alpha Finance Bank!");
        }
        else {
          System.out.println("Invalid Input!");
          lib.sleep(2000);
          lib.clearConsole();
        }
      }


    } 
    public static void printList(ArrayList<CheckingAccount> list) {
      for(int i = 0; i < list.size(); i++) {
        System.out.println((i + 1) + " -- " + list.get(i).getName());
      }
    }
}
