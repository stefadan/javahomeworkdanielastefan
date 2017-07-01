/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
public interface Saleable {
        /** 
    @const REC_SALE_PRICE is recommended price to sell 
    */ 
	public static final boolean SALEABLE = true; 
	/** 
	* Method returns the value of item that implements the saleable 
	interface. 
	* Class that implements the interface should implement this method. 
	@return method returns price for sale //aici adnotarea spune ce valoare se retrneaza
	*/ 
    public int getSalePrice();
    public void setSalePrice(int sellerAmount);

}
