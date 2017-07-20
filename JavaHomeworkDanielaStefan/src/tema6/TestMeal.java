/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;
//10.Will the following code compile without error? Why or why not?
public class TestMeal{
 //public class TestMeal implements Meal{
    //@Meal("breakfast", mainDish="cereal")
    //@Meal("lunch", mainDish="pizza")
    //@Meal("dinner", mainDish="salad")
//code will not compile: the interface Meal should declare two methods
    //public String mainDish();
    //public String id();
//both members should receive values     
    //@Meal(id="breakfast", mainDish="cereal")
    //@Meal(id="lunch", mainDish="pizza") 
    //@Meal(id="dinner", mainDish="salad") 
//even so code will not compile because an annotation type cannot be repeted
    public void evaluateDiet() {  }

    
    
}
