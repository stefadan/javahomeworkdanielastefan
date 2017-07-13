/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

public class CarProducer {
    public Car getMercedesCar(Color c){
        return new MercedesCar(c);
    }

    public Car getRenaultCar(Color c){
        return new RenaultCar(c);
    }

    public Car getLoganCar(Color c){
        return new LoganCar(c);
    }

    
}
