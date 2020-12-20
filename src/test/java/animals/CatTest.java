package animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.test.app.behaviour.MeowBehaviour;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
	@InjectMocks
    private Cat cat = new Cat();
	
	@Mock
    private MeowBehaviour behaviour;
	
	@Test
	public void testCat() {
        assertTrue( cat instanceof Cat ); 
	}
	
	@Test
	public void testSetSpeakBehaviour() {
		cat.setSpeakBehaviour(behaviour);
        assertTrue( cat.getSpeakBehaviour() instanceof MeowBehaviour ); 
	}
	
	@Test
	public void testStartSpeak() {
		when(behaviour.speak()).thenReturn("Meow!");
		cat.setSpeakBehaviour(behaviour);
        assertEquals("Meow!", cat.startSpeak());
	}
	
	@Test
	public void testDisplay() {
		assertEquals("I am a cat", cat.display());
	}
}
