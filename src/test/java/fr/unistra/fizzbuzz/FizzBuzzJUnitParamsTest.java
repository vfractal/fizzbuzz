package fr.unistra.fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzJUnitParamsTest {

	private FizzBuzz fizzbuzz = new FizzBuzz();

	@Test
	@Parameters({"1", "2", "4", "7", "11", "13", "14"})
	public void returnsNumberForInputNotDivisibleByThreeOrFive(int number) {
		assertThat(fizzbuzz.convert(number)).isEqualTo("" + number);
	}
}