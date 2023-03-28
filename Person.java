public class Person {
    private String name;
    private int age;
    private String gender;
    private double height;

    public Person(String name, int age, String gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public double getHeight() {
        return height;
    }
    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height);
    }
}
