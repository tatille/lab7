/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.Excercire1;

/**
 *
 * @author Admin
 */
public class Car  extends  Vehical{
    private String fuel;

    public Car(String fuel, String typeofVehical, Brand brand) {
        super("Car", brand);
        this.fuel = fuel;
    }

    

    public Car() {
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
    @Override
    public double getSpeed(){
        return 60;
    }
}
