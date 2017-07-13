/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;
public class LoganCar extends Car{
    private double price;
    private Color color;
    private Brand brand;

    LoganCar(Color c){
        price = 9000;
        color = c;
        brand = Brand.LOGAN;
    }
    
    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public Color getColor(){
        return color;
    }
     
    @Override
    public Brand getBrand(){
        return brand;
    }
   
    
}
