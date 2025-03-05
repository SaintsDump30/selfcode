/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleapp;

/**
 *
 * @author dumps
 */
public class SUV extends Car {
    
    public SUV(String Name, boolean isManual){
    
    super(Name,4,2,4,isManual,"SUV");
    
    }
    
    public void accelarate(int rate){
    
       int newSpeed = getCurrentSpeed()+rate;
    
    if(newSpeed == 0){
    Stop();
    ChangeGear(1);
    
    }else if(newSpeed > 0 && newSpeed <= 10 ){
    
        ChangeGear(1);
    }else if(newSpeed >10 && newSpeed <=20){
    
        ChangeGear(2);
    
    }else if(newSpeed >20 && newSpeed <=30){
    
        ChangeGear(3);
    }else if(newSpeed >30 && newSpeed <=50){
    
        ChangeGear(4);
    }else{
        ChangeGear(5);
    }
    
    if(newSpeed > 0 ){
    
    changeSpeed(newSpeed,getCurrentDirection());
    }
    
    
    }
    
    
    
}
