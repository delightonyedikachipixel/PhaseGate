import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;



public class LetterAppearanceTest{

	@Test	
	public void testgetNumberOfAppearances(){

		NumberOfAppearances characters = new NumberOfAppearances();
		
		assertEquals(characters.getNumberOfAppearances(), 0);
	
		String expected = characters.getNumberOfAppearances(); 
		String actual = "E4n4e3";
		
		assertEquals(expected, actual);

	}
}
