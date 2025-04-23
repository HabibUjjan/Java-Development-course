package com.Student.SMA;

import java.io.Serializable;

public class Comment implements Serializable {
    String commentId;
    String userId;
    String text;

    public Comment(String commentId, String userId, String text) {
        this.commentId = commentId;
        this.userId = userId;
        this.text = text;
    }
}

