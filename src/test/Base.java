package test;

public interface Base {
	/*Base show(){

		System.out.println("base class");

		return new Base();

		}*/
	//abstract method 
	public void foo1();
	
	//default method
	public default void foo2(){
		System.out.println("default void foo2() from base");	
	}
	
	//static method
	public static void foo3(){
		System.out.println("static void foo3() from base");
	}
	
	
}
