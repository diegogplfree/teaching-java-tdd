package animals;

import static org.junit.Assert.*;

import org.junit.Test;

import com.test.app.behaviour.BarkBehaviour;

import static org.mockito.Mockito.when;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DogTest {
	
	@InjectMocks
    private Dog dog = new Dog();
	
	@Mock
    private BarkBehaviour behaviour;
	
	@Test
	public void testDog() {
        assertTrue( dog instanceof Dog ); 
	}
	
	@Test
	public void testSetSpeakBehaviour() {
		dog.setSpeakBehaviour(behaviour);
        assertTrue( dog.getSpeakBehaviour() instanceof BarkBehaviour ); 
	}
	
	@Test
	public void testStartSpeak() {
		when(behaviour.speak()).thenReturn("Woff!");
		dog.setSpeakBehaviour(behaviour);
        assertEquals("Woff!", dog.startSpeak());
	}
	
	@Test
	public void testDisplay() {
		assertEquals("I am a Dog", dog.display());
	}
}
