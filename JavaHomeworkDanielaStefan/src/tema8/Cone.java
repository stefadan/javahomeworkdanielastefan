/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

public class Cone extends ThreeDimensions implements Definibila{
    
    @Override
    public String getDefinition(){
        //System.out.println(super.getDefinition()+"with a circular flat base joined to a curved side that ends in an apex point ");
        return super.getDefinition()+"with a circular flat base joined to a curved side that ends in an apex point ";
    }

}
