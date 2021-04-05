package hust.soict.hedspi.aims.media;

public class Media {
    private String title;
    private String category;
    private float cost;

    public Media(String title) {
        this.title = title;
    }

    public Media(String title, String category) {
        this(title);
        this.category = category;
    }
}
