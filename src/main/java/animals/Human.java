package animals;

import com.test.app.supertype.Animal;

/**
 * 
 * @author Diego Arboleda <ing.diego.fernando.arboleda@gmail.com>
 *
 */
public class Human extends Animal {

	@Override
	public String display() {
		return "I am a human";
	}

}
