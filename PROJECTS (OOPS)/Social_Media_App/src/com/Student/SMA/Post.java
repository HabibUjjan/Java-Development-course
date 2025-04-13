import java.util.*;

public class Post {
    String postId;
    String text;
    ArrayList<Comment> comments;
    ArrayList<String> likes;

    public Post(String postId, String text) {
        this.postId = postId;
        this.text = text;
        this.comments = new ArrayList<>();
        this.likes = new ArrayList<>();
    }
}
