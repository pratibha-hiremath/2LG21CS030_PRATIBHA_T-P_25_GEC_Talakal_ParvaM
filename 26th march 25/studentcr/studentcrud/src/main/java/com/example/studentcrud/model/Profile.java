package com.example.studentcrud.model;


public class Profile {
    private String name;
    private String gender;
    private String favoriteColor;
    private String fontSize;

    public Profile(String name, String gender, String favoriteColor, String fontSize) {
        this.name = name;
        this.gender = gender;
        this.favoriteColor = favoriteColor;
        this.fontSize = fontSize;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }
}
