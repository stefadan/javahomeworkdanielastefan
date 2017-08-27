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
public class Circle extends TwoDimensions implements Definibila {
       @Override
    public String getDefinition() {
        //System.out.println(super.getDefinition()+"whose boundary (the circumference) consists of points equidistant from a fixed point");
        return super.getDefinition()+"whose boundary (the circumference) consists of points equidistant from a fixed point";
    }

}
