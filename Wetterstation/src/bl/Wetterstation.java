/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

/**
 *
 * @author stefan
 */
public class Wetterstation {
    private String location;
   private int sea;
   private double temp;
   private int hum;

    public Wetterstation(String location, int sea, double temp, int hum) {
        this.location = location;
        this.sea = sea;
        this.temp = temp;
        this.hum = hum;
    }

    public String toString()
    {
    return String.format("Location %s, Sea: %d, Temp: %d , Hum: %d",location,sea,temp,hum);
    }
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSea() {
        return sea;
    }

    public void setSea(int sea) {
        this.sea = sea;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
        //exception handling
    }

    public int getHum() {
        return hum;
    }

    public void setHum(int hum) {
        this.hum = hum;
    }
   
   
   
    
}
