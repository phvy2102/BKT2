package com.example.appcuoiky;

public class Music {
    String name,Singel, img, time;

    Music() {

    }

    public Music(String name, String Singel, String img, String time) {
        this.name = name;
        this.Singel = Singel;
        this.img = img;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSingel() {
        return Singel;
    }

    public void setSingel(String Singel) {this.Singel = Singel;}


    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
