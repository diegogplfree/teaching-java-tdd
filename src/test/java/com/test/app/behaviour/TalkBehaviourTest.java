package com.test.app.behaviour;

import static org.junit.Assert.*;

import org.junit.Test;

public class TalkBehaviourTest {

	private TalkBehaviour behaviour = new TalkBehaviour();
	
	@Test
	public void testBarkBehaviour() {		
        assertTrue( behaviour instanceof TalkBehaviour ); 
	}
	
	@Test
	public void testSpeak() {
        assertTrue( behaviour.speak() instanceof String ); 
	}

}
