package com.test.app.behaviour;

import com.test.app.speak.SpeakBehaviour;

/**
 * 
 * @author Diego Arboleda <ing.diego.fernando.arboleda@gmail.com>
 *
 */
public class BarkBehaviour implements SpeakBehaviour {
	/**
	 * 
	 * @return String
	 */
	public String speak()
	{
		return "Woff!";
	}
}
