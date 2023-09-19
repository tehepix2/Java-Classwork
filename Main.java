import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      lib.clearConsole();
      
        boolean loop = true;
      
      Scanner input = new Scanner(System.in);
      
      Teacher teacher1 = new Teacher("Ms. Rodriguez", 'F', 24, 5.2, "MHS", "Literature", 123);
      Teacher teacher2 = new Teacher("Dr. Weiner", 'M', 13, 10.3, "AIT", "CompSci", 512);

      Student student1 = new Student("Billy", 'M', 10, 2.1, "AIT", 65, 98, 79, 88, "Math");
      Student student2 = new Student("Mike", 'M', 30, 1, "MHS", 100, 100, 43, 99, "Science");

      Maintenance main1 = new Maintenance("Sanchez", 'M', 50, 20, "AIT", "Server", 10000);
      Maintenance main2 = new Maintenance("Juan Hernandez", 'M', 4, 30, "MHS", "Fitness", 1);

      Admin admin1 = new Admin("Mclaughlin", 'F', 1, 10, "AAHS", "Supervisor", 30000);
      Admin admin2 = new Admin("Moco", 'M', 82, 0.2, "UCTECH", "Principal", 1000000);

      Teacher[] teachers = {teacher1, teacher2};

      Student[] students = {student1, student2};

      Maintenance[] maintenances = {main1, main2};

      Admin[] admins = {admin1, admin2};


      
      
     
      
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
            lib.sleep(5000);
            lib.clearConsole();
        }
        else if (choice2 == 2) {
            teachers[choice - 1].speak();
            lib.sleep(5000);
            lib.clearConsole();
        }
        else if (choice2 == 3) {
            teachers[choice - 1].teach();
            lib.sleep(5000);
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
            lib.sleep(5000);
            lib.clearConsole();
        }
        else if (choice2 == 2) {
            admins[choice - 1].speak();
            lib.sleep(5000);
            lib.clearConsole();
        }
        else if (choice2 == 3) {
            admins[choice - 1].makeMoney();
            lib.sleep(5000);
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
            lib.sleep(5000);
            lib.clearConsole();
        }
        else if (choice2 == 2) {
            maintenances[choice - 1].speak();
            lib.sleep(5000);
            lib.clearConsole();
        }
        else if (choice2 == 3) {
            maintenances[choice - 1].maintain();
            lib.sleep(5000);
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
            lib.sleep(5000);
            lib.clearConsole();
        }
        else if (choice2 == 2) {
            students[choice - 1].speak();
            lib.sleep(5000);
            lib.clearConsole();
        }
        else if (choice2 == 3) {
            students[choice - 1].procrastinate();
            lib.sleep(5000);
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
