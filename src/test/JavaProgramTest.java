package test;

public class JavaProgramTest {

	public static void main(String args[]){
		
		JavaInterviewPrograms obj = new JavaInterviewPrograms();
		
		//Calculate factorial with the help of recursion
		System.out.println("Factorial of 6 is = "+obj.factorial(6));
		
		//Calculate armstrong number
		System.out.println("153 is an armstrong number. "+obj.armstrong(153));
		System.out.println("List of armstrong number in between 1 to 1000.");
		for(int i=1;i <= 1000; i++){
			if(obj.armstrong(i)){
				System.out.print(i+", ");
			}
		}
		
		//Calculate palindrom number
				System.out.println("\n1331 is an palindrom number. "+obj.palindrome(1331));
				/*System.out.println("List of Palindrom number in between 1 to 1000.");
				for(int i=1;i <= 1000; i++){
					if(obj.palindrome(i)){
						System.out.print(i+", ");
					}
				}*/
	}
}
