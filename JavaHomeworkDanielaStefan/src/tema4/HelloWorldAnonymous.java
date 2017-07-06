/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

public class HelloWorldAnonymous {
        
    class EnglishGreeting implements HelloWorld { 
            String name; 

            @Override 
            public void greet() { 
                greetSomeone("world"); 
            } 
            @Override 
            public void greetSomeone(String someone) { 
                name = someone; 
                System.out.println("Hello " + name); 
            }            
        }

        public HelloWorld englishGreetigs(){
            return new EnglishGreeting();
        }

    class FrenchGreeting implements HelloWorld { 
            String name; 
            @Override 
            public void greet() { 
                greetSomeone("tout le monde"); 
            } 
            @Override 
            public void greetSomeone(String someone) { 
                name = someone; 
                System.out.println("Bonjour " + name); 
            } 
        }
        
        public HelloWorld frenchGreeting(){
            return new FrenchGreeting();
        }

    class SpanishGreeting implements HelloWorld { 
            String name; 
            @Override 
            public void greet() { 
                greetSomeone("mundo"); 
            } 
            @Override 
            public void greetSomeone(String someone) { 
                name = someone; 
                System.out.println("Hola " + name); 
            } 
        }
        
        public HelloWorld spanishGreeting(){
            return new SpanishGreeting();
        }
                        
    public static void main(String[] args){
        
        HelloWorldAnonymous hwac = new HelloWorldAnonymous();
        HelloWorldAnonymous.EnglishGreeting eg = (EnglishGreeting)hwac.englishGreetigs();
        HelloWorldAnonymous.FrenchGreeting fg = (FrenchGreeting)hwac.frenchGreeting();
        HelloWorldAnonymous.SpanishGreeting sg = (SpanishGreeting)hwac.spanishGreeting();
        
        eg.greetSomeone("John");
        fg.greetSomeone("Francois");
        sg.greetSomeone("Luisa");
        eg.greet();
        fg.greet();
        sg.greet();
    }
   
    
}
