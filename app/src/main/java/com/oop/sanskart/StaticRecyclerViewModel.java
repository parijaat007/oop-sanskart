package com.oop.sanskart;

public class StaticRecyclerViewModel {
    private int image;
    private String text;
    public StaticRecyclerViewModel(int image,String text){
        this.image=image;
        this.text=text;
    }

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }
}
