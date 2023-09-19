import java.util.Scanner;

public class Person {
    
    private String name;
    private char gender;
    private int age;
    private double height;
    

    
    public Person(String name, char gender, int age, double height) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
    }
    
    public void speak() {
        System.out.println("Hello World!");
    }

    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }


}
