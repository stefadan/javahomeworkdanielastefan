/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

public class Screen {
    
    public void initDisplay(){
        System.out.println("\t\t" + 0 );
    }

    public boolean zeroDivide(Button a, Button p){
        //System.out.println("p--"+p.operation+"--"+a.number);
        if (a.number == 0 && p.operation == '/') {
            return false;
        }
        return true;
    }
    
    public double displayResult(Button a, Button b, Button p){
        if (p.operation == '+')
            {
                return a.number + b.number;
            }
        else if (p.operation == '-')
            {
                return a.number - b.number;
            }
        else if (p.operation == '*'){
                return a.number * b.number;
            }
        else if(p.operation == '/'){
                if (b.number!=0){
                    return a.number / (double)b.number;
                }
            }
        return 0;
    }
        
}
