package com.example.insta.data;

public class Post {
    private int ProfileImage;
    private String ProfileName;
    private int PostImage;
    private String Likes , Caption ,Comments, Days;

    public int getProfileImage() {
        return ProfileImage;
    }

    public void setProfileImage(int profileImage) {
        ProfileImage = profileImage;
    }

    public String getProfileName() {
        return ProfileName;
    }

    public void setProfileName(String profileName) {
        ProfileName = profileName;
    }

    public int getPostImage() {
        return PostImage;
    }

    public void setPostImage(int postImage) {
        PostImage = postImage;
    }

    public String getLikes() {
        return Likes;
    }

    public void setLikes(String likes) {
        Likes = likes;
    }

    public String getCaption() {
        return Caption;
    }

    public void setCaption(String caption) {
        Caption = caption;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }

    public String getDays() {
        return Days;
    }

    public void setDays(String days) {
        Days = days;
    }

    public Post(int profileImage, String profileName, int postImage, String likes, String caption, String comments, String days) {
        ProfileImage = profileImage;
        ProfileName = profileName;
        PostImage = postImage;
        Likes = likes;
        Caption = caption;
        Comments = comments;
        Days = days;
    }
}
