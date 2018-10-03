package test;

public class JavaInterviewPrograms {

	//Factorial program by recursion function
	public int factorial(int number){
		if(number == 0){
			return 1;
		}
		return number*factorial(number-1);
	}
}
