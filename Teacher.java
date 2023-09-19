public class Teacher extends SchoolPerson {
    
    private String subject;
    private int roomNum;

    public Teacher(String name, char gender, int age, double height, String school, String subject, int roomNum) {
        super(name, gender, age, height, school);
        this.subject = subject;
        this.roomNum = roomNum;
    }

    public void displayStats() {
        super.displayStats();
        System.out.println("Subject: " + subject);
        System.out.println("Room number: " + roomNum);
    }

    public void speak() {
        System.out.println("Good morning class!");
    }

    public void teach() {
        System.out.println(super.getName() + " teaches " + subject + " to the class!");
    }
    
    
}
