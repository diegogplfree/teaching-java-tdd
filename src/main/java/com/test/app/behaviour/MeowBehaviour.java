package com.test.app.behaviour;

import com.test.app.speak.SpeakBehaviour;

/**
 * 
 * @author Diego Arboleda <ing.diego.fernando.arboleda@gmail.com>
 *
 */
public class MeowBehaviour implements SpeakBehaviour {
	/**
	 * 
	 * @return String
	 */
	public String speak()
	{
		return "Meow!";
	}
}