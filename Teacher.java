public class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher(String name, int age, String gender, double height, String subject, double salary) {
        super(name, age, gender, height);
        this.subject = subject;
        this.salary = salary;
    }
    
    public void teachStudents() {
        System.out.println("The class has gotten smarter.");
    }

    public void writeOnBoard() {
        System.out.println("The teacher wrote something on the board.");
    }

    public void displayStats() {
        super.displayStats();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}
