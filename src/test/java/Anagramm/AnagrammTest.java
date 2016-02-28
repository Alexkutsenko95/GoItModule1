package Anagramm;

import org.junit.Test;
import static org.junit.Assert.*;
import Anagramm.Anagramm;

public class AnagrammTest {
	String input = "Hello world!";
	Anagramm anagramm = new Anagramm(input);
	
	@Test
	public void inputString() {   	
	String actual = anagramm.getInputString();
	String expected = input;
	assertEquals(expected, actual);
	}
	
	@Test(expected = NullPointerException.class)
	public void nullPointer(){
		String input = null;
		Anagramm anagramm = new Anagramm(input);
		anagramm.getAnagrammString();
		
		assertTrue(true);
	}
	
	@Test
	public void anagramm() {
		
	    String actual = anagramm.getAnagrammString();
		String expected = "olleH !dlrow";
		assertEquals(expected , actual);
		}
			
	
	
}
