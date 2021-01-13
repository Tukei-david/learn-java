package com.classes.objects;

public class House {

    // These are private properties created for the object house
    private int nrOfWindows;
    private int nrOfDoors;
    private String typeOfRoof;
    private String typeOfWall;

    // These is a no value constructor that doesn't take any arguement
    public House()
    {
        nrOfWindows = 0;
        nrOfDoors = 0;
        typeOfRoof = null;
        typeOfWall = null;
    }

    // These is  parameritized constructor becouse it arguemnts and sets the values
    public House (int nrOfWindows, int nrOfDoors, String typeOfRoof, String typeOfWall)
    {
        this.nrOfWindows = nrOfWindows;
        this.nrOfDoors = nrOfDoors;
        this.typeOfRoof = typeOfRoof;
        this.typeOfWall = typeOfWall;


    }

    // Get the values of an objet also byy getter and setter method

    // Getter method(getting the values)
    public int getNrOfWindows()
    {
        return nrOfWindows;
    }

    public int getNrOfDoors()
    {
        return nrOfDoors;
    }

    public String getTypeOfRoof()
    {
        return typeOfRoof;
    }

    public String getTypeOfWall()
    {
        return typeOfWall;
    }

    // Setter method (When changing the values)
    public void setNrOfWindows (int nrOfWindows)
    {
        this.nrOfWindows = nrOfWindows;
    }

    public void setNrOfDoors(int nrOfDoors)
    {
        this.nrOfDoors = nrOfDoors;
    }

    public void setTypeOfRoof(String typeOfRoof)
    {
        this.typeOfRoof = typeOfRoof;
    }

    public void setTypeOfWall(String typeOfWall)
    {
        this.typeOfWall = typeOfWall;
    }
}
