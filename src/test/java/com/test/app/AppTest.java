package com.test.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.test.app.supertype.Animal;
import animals.Dog;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	/**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {	
    	App app = new App();
    	String[] args = new String[] {
    		"hola"	
    	};
    	app.main(args);
        assertTrue( app instanceof App );        
    }
}
