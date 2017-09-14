/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10;


public class Domnul extends Thread{
	
	private Tv tv;
	public Domnul(Tv aTv){
		tv = aTv;
	}
	
	public void run(){
                synchronized(tv){
			try{
                            tv.wait();
                        }
			catch(InterruptedException e){}                        
			domnulAudeAnuntulTv();		
                        System.out.println(domnulAudeAnuntulTv());                        
		}
            
                synchronized(this){
                            System.out.println("Domnul ii spune doamnei sa se trezeasca ... ");			
                            notify();
                    }	
        }
	
        public String domnulAudeAnuntulTv(){
            return "A-ha! Incepe emisiunea .... sa o trezesc pe sotie...";
        }
        
	}
