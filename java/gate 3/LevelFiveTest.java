import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;

    public class LevelFiveTest{

    @Test
        	
	public void testWhenLengthIs5(){
    Length review = new LevelFive ();
    int [] numbers = {10,11,12}};
    int length = 5;
    assertArrayEquals(review.getNewArray(),0);

    int expected = review.getNewArray();
    int [] actual = {10,11,12,-1,-1};

    assertArrayEquals(expected, actual);		
	}

    public void testWhenLengthIs2(){
    Length review = new LevelFive ();
    int [] numbers = {10,11,12,13,14};
    int length = 2;
    assertArrayEquals(review.getNewArray(),0);

    int expected = review.getNewArray();
    int [] actual = {10,11};

    assertArrayEquals(expected, actual);		
	}


     public void testWhenLengthIs0(){
    Length review = new LevelFive ();
    int [] numbers = {};
    int length = 2;
    assertArrayEquals(review.getNewArray(),0);

    int expected = review.getNewArray();
    int [] actual = {-1,-1,-1,-1};

    assertArrayEquals(expected, actual);		
	}


    public void testWhenLengthIs-2(){
    Length review = new LevelFive ();
    int [] numbers = {1,2,3,4,5,};
    int length = -2;
    assertArrayEquals(review.getNewArray(),0);

    int expected = review.getNewArray();
    int actual = 0;

    assertEquals(expected, actual);		
	}








}















// input = {10,11,12},5
// output = {10,11,12,-1,-1}


//input = {10,11,12,13,14},2
// output = {10,11}
