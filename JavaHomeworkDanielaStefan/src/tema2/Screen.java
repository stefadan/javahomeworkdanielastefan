/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

public class Screen {
    
    public void display(int val){
        System.out.println("\t\t" + val);
    } 

    public void display(double val){
        System.out.println("\t\t" + val);
    } 
    
    public int addition(int x, int y) {
        return x + y;
    }

    public int subtraction(int x, int y) {
        return x - y;
    }

    public int multiplication(int x, int y) {
        return x * y;
    }

    public double division(int x, int y) {
        return (double)(x/(double)y);
    }
    
}
