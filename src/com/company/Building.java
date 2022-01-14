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
        if(!contains(name)){
            String temp[] = new String[residents.length + 1];
            temp = storeArrayIntoNew(temp);
            temp[residents.length] = name;
            residents = temp;
        }
    }

    public String[] storeArrayIntoNew(String[] temp){
        for(int i = 0; i < residents.length; i++){
            temp[i] = residents[i];
        }
        return temp;
    }

    public boolean contains(String name){
        boolean contains = false;
        for(int i = 0; i < residents.length; i++){
            if(residents[i] == name){
                contains = true;
            }
        }
        return contains;
    }

    public void removeResident(String name){
        boolean hasBeenRemoved = false;
        String temp[] = new String[residents.length - 1];
        for(int i = 0; i < residents.length; i++){
            if(residents[i] == name){
                residents[i] = "";
                hasBeenRemoved = true;
            }
        }

        if(hasBeenRemoved){
            for(int i = 0; i < temp.length; i++){
                if(residents[i] != ""){
                    temp[i] = residents[i];
                }
            }
            residents = temp;
        }
    }

    public int getNumberOfResidents() {
        return residents.length;
    }
}
