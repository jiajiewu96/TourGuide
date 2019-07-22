package com.example.tourguide;

public class Location {
    private String name;
    private String description;
    private int resInt;

    public Location(String name, String description){
        this.description = description;
        this.name = name;
    }

    public Location(String name, String description, int resInt){
        this.description = description;
        this.name = name;
        this.resInt = resInt;
    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getResInt(){
        return resInt;
    }
}
