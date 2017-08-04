/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class CnpRegExp {
        public static void main (String[] args){
    //string test
    //2434355551100119997777466666624343555511001199977774666666243435555110011999777746666662434343555511001199977774666666
        try{
            Pattern pattern = Pattern.compile("([1-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])(0[1-9]|1[0-2])(19[0-9]{2})(\\d{4})");
            // read the source string using a new Scanner object 
            Scanner scannerSourceString = new Scanner(System.in); 
            System.out.println("Insert source string: "); 
            String source = scannerSourceString.next(); 
            // create the matcher as result of applying regex on source string 
            Matcher matcher = pattern.matcher(source); 
            //System.out.println("source="+source.toString()+"=="+matcher.toString());
            boolean found = false; 
            // if the regular expression or pattern was found 
            while (matcher.find()) { 
                String result; 
                result = String.format("I found text \"%s\" starting at " + "index %d until index %d.", 
                matcher.group(), 
                matcher.start(), 
                matcher.end()); 
                    System.out.println(result); 
                found = true; 
            } 

            if (!found) { 
                System.out.println("No match found :("); 
            }
    }
        catch(PatternSyntaxException ex){
            System.out.println("Incorrect defined pattern:"+ex.getPattern());
    }

   }
}
