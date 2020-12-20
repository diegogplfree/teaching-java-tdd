package com.test.app.behaviour;

import com.test.app.speak.SpeakBehaviour;

/**
 * 
 * @author Diego Arboleda <ing.diego.fernando.arboleda@gmail.com>
 *
 */
//Thank you for your time!!, subscribe to my channel!!!
public class TalkBehaviour implements SpeakBehaviour {
	/**
	 * 
	 * @return String
	 */
	@Override
	public String speak()
	{
		return "Hi!";
	}
}