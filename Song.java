public class Song {
    private double songCost;
    private String songName = "NA";
    private double songRating;
    private String songAuthorF;
    private String songAuthorL;
    private int songDay;
    private int songMonth;
    private int songYear;
    
    public Song(String name, double cost, double rating, String authorF, String authorL, int day, int month, int year) {
        this.songAuthorF = authorF;
        this.songAuthorL = authorL;
        this.songName = name;
        this.songCost = cost;
        this.songRating = rating;
        this.songDay = day;
        this.songMonth = month;
        this.songYear = year;
    }
    public double getCost() {
        return this.songCost;
    }
    public String getName() {
        return this.songName;
    }
    public double getRating() {
        return this.songRating;
    }
    public String getAuthorF() {
        return this.songAuthorF;
    }
    public String getAuthorL() {
        return this.songAuthorL;
    }
    public int getDay() {
        return this.songDay; 
    }
    public int getMonth() {
        return this.songMonth;
    }
    public int getYear() {
        return this.songYear;
    }
    public void newCost(double cost) {
        this.songCost = cost;
    }
    public void newName(String name) {
        this.songName = name;
    }
    public void newRating(double rating) {
        this.songRating = rating;
    }
    public void newAuthorFN(String fname) {
        this.songAuthorF = fname;
    }
    public void newAuthorLN(String lname) {
        this.songAuthorL = lname;
    }
    public void newDate(int day, int month, int year) {
        this.songDay = day;
        this.songMonth = month;
        this.songYear = year;
    }
}
