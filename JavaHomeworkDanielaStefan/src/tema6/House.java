/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;
//7.What is wrong with the following interface?
public interface House {
    @Deprecated
    void open(); //the method is deprecated , in the same time must be implemented
    void openFrontDoor();
    void openBackDoor();
    
}
