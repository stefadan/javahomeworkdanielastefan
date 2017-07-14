/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

public class NumberHolderDisplay{

    NumberHolder nh;

    public NumberHolderDisplay() {
        nh = new NumberHolder(12, 123456f);
    }

    public int getAnInt(){
        return nh.getAnInt();
    }
    
    public float getAFloat(){
        return nh.getaFloat();
    }
    
    public static void main(String[] args){
        NumberHolderDisplay nhd = new NumberHolderDisplay();
        System.out.println("Values: int: "+nhd.getAnInt()+" float: "+nhd.getAFloat());
    }

    
}
