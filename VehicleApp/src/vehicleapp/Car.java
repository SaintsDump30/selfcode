/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleapp;

/**
 *
 * @author dumps
 */
public class Car extends Vehicle {
    
    private String Type;
    private int Wheels;
    private int Doors;
    private int  Gears;
    private boolean isManual;
    private int CurrentGear;
    
    
    public Car(String Name, int Wheels,int Doors,int Gears,boolean isManual,String Type){
    
    super(Name);
    this.Type = Type;
    this.Gears = Gears;
    this.Doors = Doors;
    this.isManual = isManual;
    this.Wheels = Wheels;
    CurrentGear = 1;
    
    }
    
    public void ChangeGear(int newGear){
    
        this.CurrentGear = newGear;
        System.out.println("Change Gear to : " + this.CurrentGear + "Gear");
    }
    
    
    public void changeSpeed(int newSpeed,int newDirection){
    
    move(newSpeed,newDirection);
    System.out.println("Speed -> : " + newSpeed + " in Direction -> " + newDirection);
    
    }
    
}
