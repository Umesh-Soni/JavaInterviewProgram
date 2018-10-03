package test;

public class JavaInterviewPrograms {

	// Factorial :- Factorial program by recursion function
	public int factorial(int number) {
		if (number == 0) {
			return 1;
		}
		return number * factorial(number - 1);
	}

	/*
	 * Armstrong number :- A number is called an Armstrong number if it is equal
	 * to the cube of its each digit
	 */
	public boolean armstrong(int num) {

		int sum = 0, number = num;
		while (number != 0) {
			int quotient = 0;
			quotient = number % 10;
			number = number / 10;

			sum = sum + (quotient * quotient * quotient);
		}
		if (sum == num)
			return true;
		else
			return false;
	}

	/*
	 * Integer Palindrome :- An integer is called palindrome if its equal to its
	 * reverse e.g. 1001
	 */
	public boolean palindrome(int number) {
		int value = 0, quotient = 0, num = number;

		while (num != 0) {

			quotient = num % 10;
			num = num / 10;

			value = value + quotient;
			if (num != 0)
				value = value * 10;
		}
		System.out.println(" num == number "+num+" == "+number);
		if (value == number)
			return true;
		else
			return false;
	}

}
