/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehicleapp;

/**
 *
 * @author dumps
 */
public class VehicleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SUV s = new SUV("fortuner",false);
        s.move(40, 0);
        s.accelarate(20);
        s.accelarate(-60);
        
        
    }
    
}
