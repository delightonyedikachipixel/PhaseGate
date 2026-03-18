import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;



public class LargestOfTwoDArrayTest{

	@Test	
	public void testThatLargestIs90.28(){

		LargestOfTwoDArray number = new LargestOfTwoDArray();
		
		assertArrayEquals(number.getLargest(), 0);
	
		int[] expected = number.getLargest(); 
		int [] actual = [0] [1];
		
		assertArrayEquals(expected, actual);

	}
}
