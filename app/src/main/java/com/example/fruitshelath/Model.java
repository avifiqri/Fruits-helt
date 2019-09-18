package com.example.fruitshelath;

public class Model {
    private int image;
    private String name, manfaat;

    public Model(int image, String name, String manfaat) {
        this.image = image;
        this.name = name;
        this.manfaat = manfaat;
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

    public String getManfaat() {
        return manfaat;
    }

    public void setManfaat(String manfaat) {
        this.manfaat = manfaat;
    }
}
