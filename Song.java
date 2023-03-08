public class Song {
    private double songCost;
    private String songName = "NA";
    private double songRating;
    private String songAuthor;
    private int songDay;
    private int songMonth;
    private int songYear;
    
    public Song(String name, double cost, double rating, String author) {
        this.songAuthor = author;
        this.songName = name;
        this.songCost = cost;
        this.songRating = rating;
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
    public String getAuthor() {
        return this.songAuthor;
    }
    public int getDay() {
        return songDay; 
    }
    public int getMonth() {
        return songMonth;
    }
    public int getYear() {
        return songYear;
    }
}
