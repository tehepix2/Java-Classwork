public class Admin extends Person {
    private String position;
    private int authority;
    
    public Admin(String name, int age, String gender, double height, String position, int authority) {
        super(name, age, gender, height);
        this.position = position;
        this.authority = authority;
    }

    public void giveRaise() {
        System.out.println("Gave a teacher a raise!");
    }

    public void getRich() {
        System.out.println("Lowered the school's budget to increase their pay!");
    }

    public void displayStats() {
        super.displayStats();
        System.out.println("Position: " + position);
        System.out.println("Authority: " + authority);
    }
}
