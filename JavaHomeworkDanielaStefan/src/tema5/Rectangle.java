/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

public class Rectangle {
   private int width = 40;
   private int height = 50;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
   private int area(){
        return getWidth() * getHeight();
    }
    public int getArea(){
        return area();
    }

}
