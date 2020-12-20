package animals;

import com.test.app.supertype.Animal;

/**
 * 
 * @author Diego Arboleda <ing.diego.fernando.arboleda@gmail.com>
 *
 */
public class Dog extends Animal {
	
	@Override
	public String display() {
		return "I am a Dog";
	}

}
