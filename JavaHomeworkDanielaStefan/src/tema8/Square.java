/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

public class Square extends Rectangle implements Definibila {
    @Override
    public String getDefinition() {
        //System.out.println(super.getDefinition()+"and equals");
        return super.getDefinition()+"and equals";
    }

}
