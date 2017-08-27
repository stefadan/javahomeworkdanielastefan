/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

public class ThreeDimensions extends GeometricalShape implements Definibila{

    @Override
    public String getDefinition(){
        return super.getDefinition()+", 3D, ";
    }
}
