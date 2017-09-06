/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OpenNotepad {
    public static void main(String[] args) {
        ProcessBuilder p = new ProcessBuilder();
        for (int i = 0; i < 3; i++){
            p.command("notepad.exe");
            try {
                p.start();
            } catch (IOException ex) {
                Logger.getLogger(OpenNotepad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   
}
