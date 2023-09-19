import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      boolean loop = true;
      
      Scanner input = new Scanner(System.in);
      Teacher rodriTeacher = new Teacher("Ms. Rodriguez", "F", 24, 5.2, "AIT", "Literature", 123);
      
      
      Teacher[] teachers = new Teacher[5];
      Student[] students = new Student[5];
      Admin[] admins = new Admin[5];
      Maintenance[] maintenances = new Maintenance[5];
      
      while (loop) {
      System.out.println("Which list would you like to access?\n1 -- Teachers\n2 -- Administrators\n3 -- Maintenance\n4 -- Students\n5 -- Exit");
      int choice1 = input.nextInt();
      lib.clearConsole();
      if (choice1 == 1) {
        System.out.println("Choose a teacher...");
        int count = 1;
        for(Teacher i: teachers) {
            System.out.println(count + " -- " + i.getName());
            count++;
        }
        int choice = input.nextInt();
        lib.clearConsole();
        System.out.println("Chosen person: " + teachers[choice - 1].getName() + "\nWhat would you like to do?\n1 -- Display Stats\n2 -- Speak\n3 -- Teach\n");
        int choice2 = input.nextInt();
        lib.clearConsole();
        if (choice2 == 1) {
            teachers[choice - 1].displayStats();
            lib.clearConsole();
        }
        else if (choice2 == 2) {
            teachers[choice - 1].speak();
            lib.clearConsole();
        }
        else if (choice2 == 3) {
            teachers[choice - 1].teach();
            lib.clearConsole();
        }
      }

      else if (choice1 == 2) {
        System.out.println("Choose an administrator...");
        int count = 1;
        for(Admin i: admins) {
            System.out.println(count + " -- " + i.getName());
            count++;
        }
        int choice = input.nextInt();
        lib.clearConsole();
        System.out.println("Chosen person: " + admins[choice - 1].getName() + "\nWhat would you like to do?\n1 -- Display Stats\n2 -- Speak\n3 -- Make money\n");
        int choice2 = input.nextInt();
        lib.clearConsole();
        if (choice2 == 1) {
            admins[choice - 1].displayStats();
            lib.clearConsole();
        }
        else if (choice2 == 2) {
            admins[choice - 1].speak();
            lib.clearConsole();
        }
        else if (choice2 == 3) {
            admins[choice - 1].makeMoney();
            lib.clearConsole();
        }
      }
      
      else if (choice1 == 3) {
        System.out.println("Choose a maintainer...");
        int count = 1;
        for(Maintenance i: maintenances) {
            System.out.println(count + " -- " + i.getName());
            count++;
        }
        int choice = input.nextInt();
        lib.clearConsole();
        System.out.println("Chosen person: " + maintenances[choice - 1].getName() + "\nWhat would you like to do?\n1 -- Display Stats\n2 -- Speak\n3 -- Maintain something!\n");
        int choice2 = input.nextInt();
        lib.clearConsole();
        if (choice2 == 1) {
            maintenances[choice - 1].displayStats();
            lib.clearConsole();
        }
        else if (choice2 == 2) {
            maintenances[choice - 1].speak();
            lib.clearConsole();
        }
        else if (choice2 == 3) {
            maintenances[choice - 1].maintain();
            lib.clearConsole();
        }
      }

      else if (choice1 == 4) {
        System.out.println("Choose a student...");
        int count = 1;
        for(Student i: students) {
            System.out.println(count + " -- " + i.getName());
            count++;
        }
        int choice = input.nextInt();
        lib.clearConsole();
        System.out.println("Chosen person: " + students[choice - 1].getName() + "\nWhat would you like to do?\n1 -- Display Stats\n2 -- Speak\n3 -- Procrastinate");
        int choice2 = input.nextInt();
        lib.clearConsole();
        if (choice2 == 1) {
            students[choice - 1].displayStats();
            lib.clearConsole();
        }
        else if (choice2 == 2) {
            students[choice - 1].speak();
            lib.clearConsole();
        }
        else if (choice2 == 3) {
            students[choice - 1].procrastinate();
            lib.clearConsole();
        }
      }

      else if (choice1 == 5) {
        loop = false;
        lib.clearConsole();
        System.out.println("Bye bye!");
      }

      else {
        System.out.println("Enter a valid choice!");
      }
    }
   
  }
  
}
