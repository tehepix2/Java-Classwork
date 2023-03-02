public class Song {
    private double songCost;
    private String songName;
    private double songRating;
    private String songAuthor;
    
    public void createSong(String name, double cost, double rating, String author) {
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
}
