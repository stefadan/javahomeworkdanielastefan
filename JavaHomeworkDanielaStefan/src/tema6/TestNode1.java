/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;
//6. Will the following code compile? If not, why?
public class TestNode1 {

    Node1<String> node = new Node1<>();
    Comparable<String> comp = node; //will compile
    
}
