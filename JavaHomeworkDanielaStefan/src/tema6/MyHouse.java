/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;
//If you compile this program, the compiler produces a warning because open was deprecated (in the interface). 
//What can you do to get rid of that warning?
//SuppressWarnings
public class MyHouse implements House{
    @SuppressWarnings("@Deprecated") 
    public void open() {System.out.println("Deprecated..");}
    @Override
    public void openFrontDoor() {}
    @Override
    public void openBackDoor() {}

}
