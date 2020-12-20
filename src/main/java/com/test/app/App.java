package com.test.app;

import com.test.app.behaviour.BarkBehaviour;

import animals.Dog;

/**
 * Hello world!
 *
 */
public class App 
{		
    public static void main( String[] args )
    {    
    	Dog dog = new Dog();
    	dog.setSpeakBehaviour(new BarkBehaviour());
        System.out.println(dog.display()+", I say: "+dog.startSpeak());
    }
}
