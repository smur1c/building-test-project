package com.company;

public class Building {
    public static Integer count = 0;
    public String initialResident;
    public String[] residents = new String[1];
    public int buildingID;

    public Building(String initialResident){
        count++;
        buildingID = count;
        this.initialResident = initialResident;
    }

    public void addResident(String name){
        if(residents.length == 1){
            residents[0] = initialResident;
        }
        String temp[] = new String[residents.length + 1];
        for(int i = 0; i < residents.length; i++){
            temp[i] = residents[i];
        }
        temp[residents.length] = name;
        residents = new String[temp.length];
        residents = temp;
    }
}
