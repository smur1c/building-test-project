package com.company;

public class Building {
    public static Integer count = 0;
    public String initialResident;
    public int buildingID;

    public Building(String initialResident){
        count++;
        buildingID = count;
        this.initialResident = initialResident;
    }

    public void addResident(String name){
        this.initialResident = name;
    }
}
