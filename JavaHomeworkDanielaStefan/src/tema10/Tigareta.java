/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10;

public class Tigareta extends Thread {
    private Doamna doamna;
    public Tigareta(Doamna d){
        doamna = d;
    }
    
    public void run(){
                    synchronized(doamna){
			try{
                            doamna.wait();
                        }
			catch(InterruptedException e){}                        	
                        System.out.println(statusTigareta());                        
		}
    }
    
    public String statusTigareta(){
        return "Tigareta fumega langa fotoliul doamnei ...";
    }
}
