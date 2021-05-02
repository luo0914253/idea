package com.imooc.spring.ioc.entity;

public class Apple {
    private String title;
    private String origin;
    private String color;

    public Apple() {
        System.out.println("无参构造器:"+this);
    }

    public Apple(String title, String origin, String color) {
        System.out.println("带参构造器:"+this);
        this.title = title;
        this.origin = origin;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    @Override
//    public String toString() {
//        return "Apple{" +
//                "title='" + title + '\'' +
//                ", origin='" + origin + '\'' +
//                ", color='" + color + '\'' +
//                '}';
//    }
}
