package fr.unistra.fizzbuzz;

public class FizzBuzz {

	public String convert(int number) {

		StringBuilder builder = new StringBuilder();
		if(number % 3 == 0)
			builder.append("Fizz");
		if (number % 5 == 0)
			builder.append("Buzz");


		return (builder.length() != 0)? builder.toString() : String.valueOf(number);
	}
}