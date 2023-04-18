package com.research.retrofitjava;

import com.google.gson.annotations.SerializedName;

public class Post {

    private int userId;
    private Integer id;
    private String title;
    @SerializedName("body")
    private String text;

    //Constructors For POST
    public Post(int userId, String title, String text) {
        this.userId = userId;
        this.title = title;
        this.text = text;
    }

    //Getter and Setter for GET
    public int getUserId() {

        return userId;
    }

    public void setUserID(int userId) {

        this.userId = userId;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getText() {

        return text;
    }

    public void setText(String text) {

        this.text = text;
    }
}
