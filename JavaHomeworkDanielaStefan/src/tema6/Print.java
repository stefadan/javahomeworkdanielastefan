/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.List;

public class Print {

public static void print(List<? extends Number> list) {
    for (Number n : list) //will compile with warning but it will compile
        System.out.print(n + " ");
    System.out.println();
}

    
}
