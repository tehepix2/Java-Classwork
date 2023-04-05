import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        lib.clearConsole();
        Scanner input = new Scanner(System.in);
        
        Person A1 = new Admin("Edward Hughes", 86, "Male", 1.2, "CEO of School", 100);
        Person A2 = new Admin("Kennedy John", 45, "Male", 9.4, "Cleaner of Edward's Office", 1);
        
        Person T1 = new Teacher("Mr. Jones", 56, "Male", 5.2, "Math", 45000);
        Person T2 = new Teacher("Mrs. Smith", 32, "Female", 4.1, "English", 32000);

        Person S1 = new Student("John Doe", 12, "Male", 4.9, 8, 404);
        Person S2 = new Student("Mary Jones", 8, "Female", 3.9, 4, 109);
        
        
        Person[] adminList = {A1, A2};
        Person[] teacherList = {T1, T2};
        Person[] studentList = {S1, S2};

        boolean programLoop = true;
        while (programLoop) {
            System.out.println("Who would you like to see?");
            System.out.println("Admins: ");
            System.out.println("1 -- " + A1.getName());
            System.out.println("2 -- " + A2.getName());
            System.out.println("");
            System.out.println("Teachers: ");
            System.out.println("3 -- " + T1.getName());
            System.out.println("4 -- " + T2.getName());
            System.out.println("");
            System.out.println("Students: ");
            System.out.println("5 -- " + S1.getName());
            System.out.println("6 -- " + S2.getName());
            System.out.print("Enter a number: ");
            int personChoice = input.nextInt();
            lib.clearConsole();
            
            if (personChoice == 1 || personChoice == 2) {
                if (personChoice % 2 == 1) {
                    personChoice = 0;
                }
                else if (personChoice % 2 == 0) {
                    personChoice = 1;
                }
                System.out.println("1 -- Give a raise\n2 -- Get Rich\n3 -- Display Stats");
                int personInput = input.nextInt();
                lib.clearConsole();
                if (personInput == 1) {
                    ((Admin) adminList[0]).giveRaise();
                    lib.sleep(2000);
                    lib.clearConsole();
                }
                else if (personInput == 2) {
                    ((Admin) adminList[personChoice % 2]).getRich();
                    lib.sleep(2000);
                    lib.clearConsole();
                }
                else if (personInput == 3) {
                    adminList[personChoice % 2].displayStats();
                    lib.sleep(2000);
                    lib.clearConsole();
                }
            }
            if (personChoice == 3 || personChoice == 4) {
                if (personChoice % 2 == 1) {
                    personChoice = 0;
                }
                else if (personChoice % 2 == 0) {
                    personChoice = 1;
                }
                System.out.println("1 -- Teach Students\n2 -- Write on board\n3 -- Display Stats");
                int personInput = input.nextInt();
                lib.clearConsole();
                if (personInput == 1) {
                    ((Teacher) teacherList[personChoice % 2]).teachStudents();
                    lib.sleep(2000);
                    lib.clearConsole();
                }
                else if (personInput == 2) {
                    ((Teacher) teacherList[personChoice % 2]).writeOnBoard();
                    lib.sleep(2000);
                    lib.clearConsole();
                }
                else if (personInput == 3) {
                    teacherList[personChoice % 2].displayStats();
                    lib.sleep(2000);
                    lib.clearConsole();
                }
            }
            if (personChoice == 5 || personChoice == 6) {
                if (personChoice % 2 == 1) {
                    personChoice = 0;
                }
                else if (personChoice % 2 == 0) {
                    personChoice = 1;
                }
                System.out.println("1 -- Study\n2 -- Procrastinate\n3 -- Display Stats");
                int personInput = input.nextInt();
                lib.clearConsole();
                if (personInput == 1) {
                    ((Student) studentList[personChoice % 2]).study();
                    lib.sleep(2000);
                    lib.clearConsole();
                }
                else if (personInput == 2) {
                    ((Student) studentList[personChoice % 2]).procrastinate();
                    lib.sleep(2000);
                    lib.clearConsole();
                }
                else if (personInput == 3) {
                    studentList[personChoice % 2].displayStats();
                    lib.sleep(2000);
                    lib.clearConsole();
                }
            }

        }

    } 
}
