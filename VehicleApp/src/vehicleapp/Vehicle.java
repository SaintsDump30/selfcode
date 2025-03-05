/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleapp;

/**
 *
 * @author dumps
 */
public class Vehicle {
    
    
    private String Name;
    private int CurrentSpeed;
    private int CurrentDirection;
    
    
    public Vehicle(String Name){
    
       this.Name = Name; 
       this.CurrentSpeed = 0;
       this.CurrentDirection = 0;
    
    
    }
    
    public void Steer(int Direction){
    
    this.CurrentDirection += CurrentDirection;
    System.out.println("Steer method : " + CurrentDirection + "Degrees");
    
    }
    
    
    
    public void move(int Speed, int Direction){
    
        CurrentSpeed = Speed;
        CurrentDirection = Direction;
        
        System.out.println("Moving at : " + Speed + "in Direction " + Direction);
        
    
    }
    
    
    public String getName(){
        return Name;
    }
    
    public void setName(String Name){
        this.Name= Name;
    }
    
    public int getCurrentSpeed(){
        return CurrentSpeed;
    }
    
    public void setCurrentSpeed(int CurrentSpeed){
        
        this.CurrentSpeed = CurrentSpeed;
    }
    
    public int getCurrentDirection(){
        return CurrentDirection;
        
    }
    
    public void setCurrentDirection(int CurrentDirection){
    
           this.CurrentDirection = CurrentDirection;
    }
            
    public void Stop(){
        this.CurrentSpeed = 0;
    }
}
