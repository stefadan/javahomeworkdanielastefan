/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10;

public class Tv extends Thread {
	private boolean emisiunePreferata = false;
        
	public void incepeEmisiune(){
		emisiunePreferata = true;
	}
	
	public void run(){
		synchronized(this){
			incepeEmisiune();
			System.out.println("TV anunta inceperea emisiunii, ceea ce il face atent pe domnul");			
			notify();
		}		
        }
	
}