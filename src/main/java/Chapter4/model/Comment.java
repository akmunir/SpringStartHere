package Chapter4.model;

public class Comment {
    private String author;
    private String message;
    public Comment(String author, String message) {
        this.author = author;
        this.message = message;
    }
    public String toString() {
        return author + ": " + message;
    }
}
