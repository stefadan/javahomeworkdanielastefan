/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

/**
 *
 * @author iulica
 */
public class Triangle extends TwoDimensions implements Definibila{
    @Override
    public String getDefinition() {
        //System.out.println(super.getDefinition()+"with three straight sides and three angles");
        return super.getDefinition()+"with three straight sides and three angles";
    }

    
}
