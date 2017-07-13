/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;


import java.util.Scanner;

public class ComputerOOP {
      
    public static void main (String[] args){
        
        Scanner s = new Scanner(System.in);
        char o;
        boolean goOn = true; //the calculator will go on with another calculation       
        
        ComputerOOP c = new ComputerOOP();
        Screen e = new Screen();
        Button a = new Button(); Button b = new Button(); Button p = new Button();
        
        while (goOn == true){        
                System.out.println("Please provide first number: ");        
                a.readNumber(s.nextInt());
                System.out.println("Please provide operation :  +    -   *   /   ");
                o  = s.next().charAt(0);
                p.readOperation(o);
                System.out.println("Please provide second number: ");
                b.readNumber(s.nextInt());
                
                switch(o){
                    case '+' :
                    System.out.println("o="+o);
                        e.display(e.addition(a.number, b.number));
                        break;
                    case '-' :
                        e.display(e.subtraction(a.number, b.number));
                        break;
                     case '*' : 
                        e.display(e.multiplication(a.number, b.number));
                        break;
                    case '/' : 
                        if (b.number != 0 ) {
                            e.display(e.division(a.number, b.number));    
                            }
                        break;
                    default :
                        break;
                }

                System.out.println("Press X to close calculator or any key to continue");
               
                char x = s.next().charAt(0);
                    if (x == 'X'){
                        goOn = false; //execution is finished 
                    }
                    else {
                        goOn = true; 
                    }
            }  
       }    
    }
