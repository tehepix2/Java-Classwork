package src;
import src.MagazineStuff.*;
import java.util.Scanner;



class Main {
    public static void main(String[] args) {
      lib.clearConsole();
      Scanner input = new Scanner(System.in);
      Magazine mag1 = new Magazine("Egg", "egg", "bingus");
      Magazine mag2 = new Magazine("eGg", "egg", "bingus");
      Magazine mag3 = new Magazine("egG", "egg", "bingus");

      Link node3 = new Link(mag3, null);
      Link node2 = new Link(mag2, node3);
      Link node1 = new Link(mag1, node2);

      MagazineRack rack1 = new MagazineRack(node1);
      

      boolean loop = true;
      while(loop) {
        System.out.println("Welcome to your magazine rack!");
        lib.sleep(1000);
        System.out.println("What would you like to do?\n1 -- View a Magazine\n2 -- Edit a magazine\n3 -- Add a magazine\n4 -- Leave");
        int menuChoice = input.nextInt();
        lib.clearConsole();
        if (menuChoice == 1) {
          rack1.displayRack(rack1.getHead());
          System.out.print("What would you like to access? : ");
          int magChoice = input.nextInt();
          System.out.println(rack1.chooseItem(rack1.getHead(), magChoice).getName());
        }

        else if (menuChoice == 2) {

        }

        else if (menuChoice == 3) {

        }

        else if (menuChoice == 4) {
          loop = false;
          System.out.println("You closed the magazine rack.");
          input.close();
        }
        else {
          System.out.println("Invalid input!");
        }
      }

    } 
}
