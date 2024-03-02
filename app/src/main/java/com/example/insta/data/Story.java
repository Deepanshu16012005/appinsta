package com.example.insta.data;

public class Story {
    private int id;
    private String UserName;
    private int UserImage;

    public Story(int id, String userName, int userImage) {
        this.id = id;
        UserName = userName;
        UserImage = userImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getUserImage() {
        return UserImage;
    }

    public void setUserImage(int userImage) {
        UserImage = userImage;
    }

}
