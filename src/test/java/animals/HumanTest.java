package animals;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.test.app.behaviour.TalkBehaviour;

@RunWith(MockitoJUnitRunner.class)
public class HumanTest {

	@InjectMocks
    private Human human = new Human();
	
	@Mock
    private TalkBehaviour behaviour;
	
	@Test
	public void testHuman() {
        assertTrue( human instanceof Human ); 
	}
	
	@Test
	public void testSetSpeakBehaviour() {
		human.setSpeakBehaviour(behaviour);
        assertTrue( human.getSpeakBehaviour() instanceof TalkBehaviour ); 
	}
	
	@Test
	public void testStartSpeak() {
		when(behaviour.speak()).thenReturn("Meow!");
		human.setSpeakBehaviour(behaviour);
        assertEquals("Meow!", human.startSpeak());
	}
	
	@Test
	public void testDisplay() {
		assertEquals("I am a human", human.display());
	}
}
