/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author iulica
 */
public class Calculator {
    int a;
    int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    
    public String toString(){
        return getA()+" "+getB();
    }
    

    public int add(int a, int b){
        return a+b;
    }
    
    public int decrease(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        if (b != 0){
            return a/b;
        }
        return 0;
    }
    
    public void clear(int a, int b){
        a = 0;
        b = 0;
    }

    public void close (){
        System.exit(0);
    }
    
    public int getResult(int a, char p, int b)
     {
        //System.out.println("1");
        if (p == 'A'){
        //System.out.println("2");
            int n = add(a,b); 
        //System.out.println("3");
           return n;
        }
        else if (p == 'S') {
           int n = decrease(a,b);
           return n;
        }        
        else if (p=='I'){
           int n = multiply(a,b);
           return n;
        }        

        else if (p=='M'){
           int n = divide(a,b);
           return n;
        }        

        else if (p=='C'){
           clear(a,b);
           return 0;
        }        
        else if (p=='X'){
            close();
        }
        return 0;
        
    }


   public static void main (String[] args){
   
        Scanner s = new Scanner(System.in);
        char o;

        System.out.println("Introduceti operatia : A-adunare/S-scadere/I-inmultire/M-impartire/C-reset/X-iesire ");
            
            o  = s.next().charAt(0); // Caracterul de l pozitia 0
            Calculator c = new Calculator();
            if (o=='X'){
                System.out.println("Exit");
                int r = c.getResult(0, 'X', 0);
             }
             if (o=='C'){
                 int r = c.getResult(0, 'C', 0);
                System.out.println("Reset: a="+c.getA()+" b="+c.getB());                 
             }
             else{ 
                System.out.println("Introduceti primul numar");
                int a = s.nextInt();       
                System.out.println("Introduceti al doilea numar");
                int b = s.nextInt();   
                int r = c.getResult(a, o, b);
                System.out.println("--Rezultatul este " + r );
             }
   }    
}
