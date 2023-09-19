public class Maintenance extends SchoolPerson {
    private String type;
    private int buffness;


    
    public Maintenance(String name, char gender, int age, double height, String school, String type, int buffness) {
        super(name, gender, age, height, school);
        this.type = type;
        this.buffness = buffness;
    }
    public void speak() {
        System.out.println("Aw man, another kid vomited.");
    }
    public void displayStats() {
        super.displayStats();
        System.out.println("Type of maintenance: " + type);
        if (buffness > 9000) {
            System.out.println("Buffness is over 9000!!!");
        }
        else {
            System.out.println("Buffness: " + buffness);
        }  
    }
    public void maintain() {
        System.out.println(super.getName() + " maintains the " + type + " room!");
    }

}
