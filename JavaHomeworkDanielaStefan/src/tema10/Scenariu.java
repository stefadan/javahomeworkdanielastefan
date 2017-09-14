/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Scenariu {
	public static void main (String[] args){
	    
			Tv tv = new Tv();
			Domnul domn = new Domnul (tv);
			Doamna doamna = new Doamna(domn);
                        Tigareta tigareta = new Tigareta(doamna);
			
                        ExecutorService exec = Executors.newCachedThreadPool();
                        exec.execute(tv);
                        exec.execute(domn);
                        exec.execute(doamna);
                        exec.execute(tigareta);
                        
                        exec.shutdownNow();
                        
			//domn.start();
			//doamna.start();

	}
	
}
