package com.example.tourguide;

public class Location {
    private String name;
    private String description;
    private int resInt;
    private String date;

    private final int NO_IMAGE_PROVIDED = -1;
    private final String NO_DATE_PROVIDED = "";

    public Location(String name, String description){
        this.description = description;
        this.name = name;
        date = "";
        resInt = -1;
    }
    public Location (String name, String description, String date){
        this.description = description;
        this.name = name;
        this.date = date;
        resInt = -1;
    }

    public Location(String name, String description, int resInt){
        this.description = description;
        this.name = name;
        this.resInt = resInt;
        date = "";
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
    public String getDate(){
        return date;
    }
    public boolean hasImage(){
        return resInt != NO_IMAGE_PROVIDED;
    }
    public boolean hasDate(){
        return !date.equals(NO_DATE_PROVIDED);
    }
}
