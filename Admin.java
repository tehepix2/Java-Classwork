public class Admin extends SchoolPerson {
    private String role;
    private int wealth;
    
    public Admin(String name, char gender, int age, double height, String school, String role, int wealth) {
        super(name, gender, age, height, school);
        this.role = role;
        this.wealth = wealth;
    }

    public void speak() {
        System.out.print("What shall I do to, 'improve' the school today?");
    }

    public void displayStats() {
        super.displayStats();
        System.out.println("Role: " + role);
        System.out.println("Wealth: " + wealth);
    }

    public void makeMoney() {
        System.out.println(super.getName() + " reduced the school's budget to gain more money!");
        wealth+=3000;
    }
}
