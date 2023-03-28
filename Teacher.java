public class Teacher extends Person {
    private String subject;
    private int students;

    public Teacher(String name, int age, String gender, double height, String subject, int students) {
        super(name, age, gender, height);
        this.subject = subject;
        this.students = students;
    }
    
    

    public void displayStats() {
        super.displayStats();
        System.out.println("Subject: " + subject);
        System.out.println("Students: " + students);
    }
}
