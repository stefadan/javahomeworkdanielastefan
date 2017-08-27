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
public class Rectangle extends TwoDimensions implements Definibila{

    @Override
    public String getDefinition() {
        //System.out.println(super.getDefinition()+"4-sided with straight sides where all interior angles are right angles (90°) and opposite sides parallel ");
        return super.getDefinition()+"4-sided with straight sides where all interior angles are right angles (90°) and opposite sides parallel ";
    }

    
}
