package com.Student.SMA;
import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    String userId;
    String username;
    String email;
    String contact;
    String password;
    ArrayList<Post> posts;

    public User(String userId, String username, String email, String contact, String password) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.contact = contact;
        this.password = password;
        this.posts = new ArrayList<>();
    }
}

