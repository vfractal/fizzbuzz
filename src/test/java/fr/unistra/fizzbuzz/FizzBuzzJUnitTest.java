package fr.unistra.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzJUnitTest {
	private int limit = 100;
	private FizzBuzz fizzbuzz = new FizzBuzz();

	@Test
	public void returnsNumberForInputNotDivisibleByThreeAndFive() {

		for (int i = 0; i < 100; i++){
			if ((i % 3 != 0) && (i % 5 != 0 ) )
				assertEquals(String.valueOf(i), fizzbuzz.convert(i));
		}
	}

	@Test
	public void returnsNumberForInputDivisibleByByThreeOnly() {
		for (int i = 0; i < 100; i++){
			if ((i % 3 == 0) && (i % 5 != 0 ) )
				assertEquals("Fizz", fizzbuzz.convert(i));
		}
	}

	@Test
	public void returnsNumberForInputDivisibleByOnlyByFive() {
		for (int i = 0; i < 100; i++){
			if ((i % 5 == 0 ) && (i % 3 != 0) )
				assertEquals("Buzz", fizzbuzz.convert(i));
		}
	}

	@Test
	public void returnsNumberForInputDivisibleThreeAndByFive() {
		for (int i = 0; i < 100; i++){
			if ((i % 3 == 0) && (i % 5 == 0 ) )
				assertEquals("FizzBuzz", fizzbuzz.convert(i));
		}
	}
}