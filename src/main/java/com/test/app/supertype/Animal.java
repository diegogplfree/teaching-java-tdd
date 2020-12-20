package com.test.app.supertype;

import com.test.app.speak.SpeakBehaviour;

/**
 * 
 * @author Diego Arboleda <ing.diego.fernando.arboleda@gmail.com>
 *
 */
public abstract class Animal {
	SpeakBehaviour speakBehaviour;
	/**
	 * 
	 * @param sb
	 */
	public void setSpeakBehaviour(SpeakBehaviour sb) {
		speakBehaviour = sb;
	}
	/**
	 * 
	 * @return SpeakBehaviour
	 */
	public SpeakBehaviour getSpeakBehaviour() {
		return speakBehaviour;
	}
	
	/**
	 * Start speak behaviour
	 */
	public String startSpeak() {
		return speakBehaviour.speak();
	}
	
	public abstract String display();
}
