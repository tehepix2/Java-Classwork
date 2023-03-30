import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Person A1 = new Admin("Edward Hughes", 86, "Male", 1.2, "CEO of School", 100);
        Person A2 = new Admin("Kennedy John", 45, "Male", 9.4, "Cleaner of Edward's Office", 1);
        
        Person T1 = new Teacher("Mr. Jones", 56, "Male", 5.2, "Math", 45000);
        Person T2 = new Teacher("Mrs. Smith", 32, "Female", 4.1, "English", 32000);

        Person S1 = new Student("John Doe", 12, "Male", 4.9, 8, 404);
        Person S2 = new Student("Mary Jones", 8, "Female", 3.9, 4, 109);
        
        
        Person[] personList = {A1, A2, T1, T2, S1, S2};
        
    } 
}
