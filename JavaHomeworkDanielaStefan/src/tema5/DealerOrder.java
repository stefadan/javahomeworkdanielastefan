/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

public class DealerOrder {

        static void reportCar(Car c){
            System.out.println("Report: brand: "+c.getBrand()+"\t producer price: "+c.getPrice()+" \t color: "+c.getColor());
        }
                
        static void reportAll(Car[] a){
            for (Car c: a){
                 reportCar(c); 
            }
        }
           
    public static void main(String[] args){
        CarDealer cd = new CarDealer();
        Car mercedes = cd.orderMercedesCar(Color.RED);    
        cd.setSellPrice(mercedes, 2000); //2000 seller expenses
        cd.setRentPrice(400);
        System.out.println("Car offer: "+mercedes.getBrand()+"\t color: "+mercedes.getColor()+"\t producerPrice: "+mercedes.getPrice()+"\t sellerPrice: "+cd.getSellPrice()+"\t rentPrice: "+cd.getRentPrice());

        Car renault = cd.orderRenaultCar(Color.WHITE);    
        cd.setSellPrice(renault, 1500); //1500 seller expenses
        cd.setRentPrice(300);
        System.out.println("Car offer: "+renault.getBrand()+"\t color: "+renault.getColor()+"\t producerPrice: "+renault.getPrice()+"\t sellerPrice: "+cd.getSellPrice()+"\t rentPrice: "+cd.getRentPrice());

        Car logan = cd.orderLoganCar(Color.BLACK);    
        cd.setSellPrice(logan, 1000); //1000 seller expenses
        cd.setRentPrice(200);
        System.out.println("Car offer: "+logan.getBrand()+"\t color: "+logan.getColor()+"\t producerPrice: "+logan.getPrice()+"\t sellerPrice: "+cd.getSellPrice()+"\t rentPrice: "+cd.getRentPrice());

        Car anotherLogan = cd.orderLoganCar(Color.WHITE);    
        cd.setSellPrice(anotherLogan, 1000); //1000 seller expenses
        cd.setRentPrice(200);
        
        Car[] m = {mercedes, logan, renault, anotherLogan};
        reportAll(m);       
        
    }
    
}
