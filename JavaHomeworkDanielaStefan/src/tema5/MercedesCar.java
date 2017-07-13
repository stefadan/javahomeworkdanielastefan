/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

public class MercedesCar extends Car{
    private double price;
    private Color color;
    private Brand brand;

    MercedesCar(Color c){
        price = 15000;
        color = c;
        brand = Brand.MERCEDES;
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
