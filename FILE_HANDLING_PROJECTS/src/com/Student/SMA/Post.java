package com.Student.SMA;

import java.io.Serializable;
import java.util.ArrayList;

public class Post implements Serializable {
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
