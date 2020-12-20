package com.test.app.behaviour;

import static org.junit.Assert.*;

import org.junit.Test;

public class BarkBehaviourTest {
	
	private BarkBehaviour behaviour = new BarkBehaviour();
	
	@Test
	public void testBarkBehaviour() {		
        assertTrue( behaviour instanceof BarkBehaviour ); 
	}
	
	@Test
	public void testSpeak() {
        assertTrue( behaviour.speak() instanceof String ); 
	}
}
