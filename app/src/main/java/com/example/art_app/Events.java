package com.example.art_app;

public class Events {
    private   String envent_name,time;
    private  int image,love;

    public void setEnvent_name(String envent_name) {
        this.envent_name = envent_name;
    }

    public String getEnvent_name() {
        return envent_name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public int getLove() {
        return love;
    }
}
