/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
public class Cars {

	public static void main(String[] args){
        short viteza = 10;
        Car mercedes = new Car("Mercedes", viteza, Car.Color.YELLOW, 15000);
        Car renault = new Car("Renault", viteza, Car.Color.GREEN, 12000);
         
        mercedes.setSalePrice(1000); //method argument=sellerAmount (seller expenses) - amount set by the seller
        mercedes.setDailyRentPrice(200);
         
        renault.setSalePrice(800); //method argument=sellerAmount (seller expenses) - amount set by the seller 
        renault.setDailyRentPrice(150);
         
        System.out.println("Sale price for "+mercedes.getName()+" = "+mercedes.getSalePrice()+" - rent price = "+mercedes.getDailyRentPrice());        
        System.out.println("Sale price for "+renault.getName()+" = "+renault.getSalePrice()+" - rent price = "+renault.getDailyRentPrice());
        
        //vreau sa modific pretul de vanzare si pretul de inchiriere - tema - cum fac
        //producatorul stabileste pretul de vanzare          
        //cui apartie atributul pret, cine il seteaza     
	}
    
}
