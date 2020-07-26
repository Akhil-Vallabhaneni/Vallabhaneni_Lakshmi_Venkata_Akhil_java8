import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Teststream {
	@Test
	public void test() {
		assertEquals(20,AverageListOfIntegers.average(Arrays.asList(10,20,30)));
	}
	@Test
	public void test1() {
		assertEquals(Arrays.asList("ade","acc"),ThreeLetterWordStartsWitha.word(Arrays.asList("ade","kfg","b","acc")));
	}
	@Test
	public void test2() {
		assertEquals(Arrays.asList("madam","rotor"),Palindrome.PalindromeList(Arrays.asList("madam","band","ford","pistol","rotor")));
	}

}

   