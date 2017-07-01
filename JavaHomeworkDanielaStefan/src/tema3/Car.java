/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author iulica
 */
public class Car {
    
    	/** 
	@enum enumeration of accepted car colors 
	*/ 
	 
	public enum Color { WHITE, RED, YELLOW, GREEN, GRAY, BLACK }; 
	/** 
	Internal hidden fields / attributes 
	*/
	 	 
	private Color color; 
	private String name; 
	private short speed; 
	private int initPrice; //set by the factory
	private int salePrice; //set by the seller	 
	private int dailyRentPrice;
	 
	public int getInitPrice() {	 
		return initPrice;
	}
	
	public void setInitPrice(int initPrice) {
		this.initPrice = initPrice;
	}
	 	 
	/** 
	Constructors  
	*/ 
	 
	public Car(){ 
		name = "Default car name"; 
		speed = 90; 
	} 
	 
	public Car(String carName, short carSpeed, Color carColor, int carInitPrice){ //completez aici instantierea si initializarea!! 
		name = carName; 
		speed = carSpeed; 
		color = carColor; 
		initPrice = carInitPrice;
	} 
	 
	/*get-ers and set-ers*/ 
	 
	public String getName(){ 	 
		return(name); 
	} 
	 
	public Color getColor(){ 
		return(color); 
	} 
	 
	public short getSpeed(){ 
		return(speed); 
	} 
	 
	public void setName(String newName){ 
		name = newName; 
	}
	 
	public void setColor(Color newColor){ 
		color = newColor; 
	} 
	 
	public void setSpeed(short newSpeed){ 
		speed = newSpeed; 
	} 
	 
	/** 
	The method increase actual speed of Car until final speed specified.  
	* @param newSpeed is new speed 
	*/ 
	 
	public void increaseSpeed(short newSpeed){ 
		if(newSpeed > speed){ 
			speed = newSpeed; 
		} 	 
		else if (newSpeed < speed){ 
			decreaseSpeed(newSpeed); 
		} 
	} 
	 
	/** 
	The method decrease actual speed of Car until final speed specified. 
	* @param newSpeed is new speed 
	*/ 
	 
	public void decreaseSpeed(short newSpeed){ 
	if(newSpeed < speed){ 	 
		speed = newSpeed; 
		} 
	else if (newSpeed < speed){ 
		increaseSpeed(newSpeed); 
		} 
	} 
	 
	/** 
	Abstract method defined in Saleable interface implemented by class car 
	* is implemented here. 
	* @return 
	* @override Saleable.getSalePrice() method 
	*/ 
	 
	public int getSalePrice(){ 
	//return(12000); 
		return salePrice;
	} 
	 
	public float getVatAmount(){
		return (float)(0.19*initPrice); //VAT rate applied by the seller
	}
	
	/** 
	Abstract method defined in Rentable interface implemented by class car 
	* is implemented here.  
	* @return 
	* @override Rentable.getDailyRentPrice() method 
	*/ 
	 
	public int getDailyRentPrice(){ 
		//return(250); 
		return dailyRentPrice;
	}
 
	public void setDailyRentPrice(int rentAmount){
		dailyRentPrice = rentAmount;
	}
	 
	public void setSalePrice(int sellerAmount){		 
		salePrice = initPrice + (int)(getVatAmount()) + sellerAmount;
	}

    
}
