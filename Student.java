public class Student extends Person {
    private int gradeLevel;
    private int classNum;
    
    public Student(String name, int age, String gender, double height, int gradeLevel, int classNum) {
        super(name, age, gender, height);
        this.gradeLevel = gradeLevel;
        this.classNum = classNum;
    }
    
    public void study() {
        System.out.println(super.getName() + " got smarter!");
    }

    public void procrastinate() {
        System.out.println(super.getName() + " watched TV to forget about assignments.");
    }
    
    public void displayStats() {
        super.displayStats();
        System.out.println("Grade level: " + gradeLevel);
        System.out.println("Class: " + classNum);
    }
}
