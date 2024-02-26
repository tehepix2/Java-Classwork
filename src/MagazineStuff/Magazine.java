package src.MagazineStuff;

public class Magazine {
    private String name;
    private String genre;
    private String content;

    public Magazine(String name, String genre, String content) {
        this.name = name;
        this.genre = genre;
        this.content = content;
    }
    
    public void displayContent() {
        System.out.println(content);
    }
    
    public String getName() {
        return name;
    }
    
    public String getGenre() {
        return genre;
    }

}
