/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.ArrayList;

public class CarDealer implements Saleable, Rentable {
    private double sellPrice;
    private double rentPrice;
    ArrayList<Car> al = new ArrayList<Car>();
    
    @Override
    public void setSellPrice(Car c, double sellerAmount){
        sellPrice = c.getPrice() + c.getPrice()*0.19 + sellerAmount;
    }    

    @Override
    public void setRentPrice(double rentAmount){
        rentPrice = rentAmount;
    }

    public double getSellPrice(){
        return sellPrice;
    }

    public double getRentPrice(){
        return rentPrice;
    }

    CarProducer cp = new CarProducer();
    /*public CarProducer carProducer(){
        return new CarProducer();
    }*/
    
    public Car orderMercedesCar(Color c){
        return cp.getMercedesCar(c); 
    }

    public Car orderRenaultCar(Color c){
        return cp.getRenaultCar(c); 
    }

    public Car orderLoganCar(Color c){
        return cp.getLoganCar(c); 
    }

    public void carPark(Car c){
        al.add(c);
    }
    
    public ArrayList<Car> reportList(){
        return al;
    }
}
