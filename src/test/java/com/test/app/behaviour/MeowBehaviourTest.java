package com.test.app.behaviour;

import static org.junit.Assert.*;

import org.junit.Test;

public class MeowBehaviourTest {

	private MeowBehaviour behaviour = new MeowBehaviour();
	
	@Test
	public void testBarkBehaviour() {		
        assertTrue( behaviour instanceof MeowBehaviour ); 
	}
	
	@Test
	public void testSpeak() {
        assertTrue( behaviour.speak() instanceof String ); 
	}
}
