/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

public class TruncatedPyramid extends Pyramid implements Definibila{
    @Override
    public String getDefinition(){
        //System.out.println(super.getDefinition()+"cutted by a plane paralled to the base and removing the part containing the apex");
        return super.getDefinition()+"cutted by a plane paralled to the base and removing the part containing the apex";
    }
}
