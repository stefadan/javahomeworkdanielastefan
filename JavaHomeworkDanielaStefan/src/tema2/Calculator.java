/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import java.util.Scanner;

public class Calculator {

    //boolean on;
    //boolean off;

    public void onOff(boolean a){
        if (a == true) {
            System.out.println("Calculator opened");
        }
        else {
            System.out.println("Calculator closed");
        }
    }

      
    public static void main (String[] args){
        
        Scanner s = new Scanner(System.in);
        char o;
        boolean goOn = true; //the calculator will go on with another calculation       
        
        Calculator c = new Calculator();
        Screen e = new Screen();
        Button a = new Button(); Button b = new Button(); Button p = new Button();
        c.onOff(true);
        e.initDisplay();

        while (goOn == true){        
                System.out.println("Please provide first number: ");        
                a.readNumber(s.nextInt());
                System.out.println("Please provide operation :  +    -   *   /   ");
                o  = s.next().charAt(0);
                p.readOperation(o);
                System.out.println("Please provide second number: ");
                b.readNumber(s.nextInt());
            
                    if (e.zeroDivide(b, p) == true ) {
                        System.out.println("Result " + e.displayResult(a, b, p));    
                        }
                    else{
                        System.out.println("Cannot divide to 0" );
                        }     
            
                System.out.println("Press X to close calculator or any key to continue");
                char x = s.next().charAt(0);
                    if (x == 'X'){
                        goOn = false; //execution is finished 
                        c.onOff(goOn);//close the calculator
                    }
                    else {
                        goOn = true; 
                    }
            }  
       }    
    }
        

    

