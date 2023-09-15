public class SchoolPerson extends Person {
    private String school;

    
    public SchoolPerson(String name, char gender, int age, double height, String school) {
       
        super(name, gender, age, height);
        this.school = school;
    }
}
