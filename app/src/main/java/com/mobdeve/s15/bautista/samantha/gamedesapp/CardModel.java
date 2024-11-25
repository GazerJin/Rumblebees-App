package com.mobdeve.s15.bautista.samantha.gamedesapp;

public class CardModel {

    int image;
    String name,type, description;

    public CardModel(int image, String name, String type, String description) {
        this.image = image;
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
