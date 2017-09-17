/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10;


public class Doamna extends Thread{

	private Domnul domn;
	public Doamna(Domnul b){
		domn = b;
	}
        
	
	public void run(){
		synchronized(domn){
			try{
                            domn.wait();
			}
			catch(InterruptedException e){}
			
			doamnaSeTrezeste();
                        System.out.println(doamnaSeTrezeste());
		}
                
                synchronized(this){
                    doamnaCautaTigareta();
                    System.out.println(doamnaCautaTigareta());			
                    notify();
		}		
	}
	
	public String doamnaSeTrezeste(){
		return "A-ha! Ha! Asta e emisiunea mea preferata ...";		
	}

      	public String doamnaCautaTigareta(){
		return "Oare unde e tigareta mea?";		
	}

        
}
	