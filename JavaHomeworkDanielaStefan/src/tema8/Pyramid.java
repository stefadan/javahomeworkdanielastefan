/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

public class Pyramid extends ThreeDimensions implements Definibila{
    String name = this.getClass().getSimpleName()+" is ";
    @Override
    public String getDefinition(){
        //System.out.println(name+super.getDefinition() +"formed by connecting all the corners of a polygon to a central apex ");
        return super.getDefinition() +"formed by connecting all the corners of a polygon to a central apex ";
    }
}
