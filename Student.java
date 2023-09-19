public class Student extends SchoolPerson {
    private int mathGrade;
    private int litGrade;
    private int sciGrade;
    private int ssGrade;
    private String favSub;
    
    public Student(String name, char gender, int age, double height, String school, int mathGrade, int litGrade, int sciGrade, int ssGrade, String favSub) {
        super(name, gender, age, height, school);
        this.mathGrade = mathGrade;
        this.litGrade = litGrade;
        this.sciGrade = sciGrade;
        this.ssGrade = ssGrade;
        this.favSub = favSub;
    }

    public void displayStats() {
        super.displayStats();
        System.out.println("Math Grade: " + mathGrade);
        System.out.println("Literature Grade: " + litGrade);
        System.out.println("Science Grade: " + sciGrade);
        System.out.println("Social Studies Grade: " + ssGrade);
        System.out.println("Favorite subject: " + favSub);
    }

    public void speak() {
        System.out.println("I love going to school!");
    }

    public void procrastinate() {
        System.out.println(super.getName() + " procrastinated on their homework!");
    }
    
}


