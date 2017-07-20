/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;
//5. Will the following code compile? If not, why?
public class TestNode {

public static void main (String[] args){
    Node<Circle> nc = new Node<>(); //this will compile - the compiler will use type inference to determine the type
    //Node<Shape>  ns = nc; //undefined inheritance between Node<Shape> and Node<Circle>
}
    
}
