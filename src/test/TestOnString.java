package test;

public class TestOnString implements Base{
	
	/*static void foo(){
		System.out.println("Foo from TestOnString");
	}*/
	
	public static void main(String args[]) {
		/*String s = "Now is the time for all good men to come to the aid of their country.";
		System.out.println(s);
		System.out.println("indexOf(t) = " +s.indexOf('t'));
		System.out.println("lastIndexOf(t) = " +s.lastIndexOf('t'));
		System.out.println("indexOf(the) = " +s.indexOf("the"));
		System.out.println("lastIndexOf(the) = " +s.lastIndexOf("the"));
		System.out.println("indexOf(t, 10) = " +s.indexOf('t', 10));
		System.out.println("lastIndexOf(t, 60) = " +s.lastIndexOf('t', 60));
		System.out.println("indexOf(the, 10) = " +s.indexOf("the", 10));
		System.out.println("lastIndexOf(the, 60) = " +s.lastIndexOf("the", 60));*/
		TestOnString temp = new TestOnString();
		temp.foo1();
		temp.foo2();
		//temp.foo3();		//its static method
		Base.foo3();
		
		}

	@Override
	public void foo1() {
		// TODO Auto-generated method stub
		System.out.println("default void foo1() from TestOnString");
	}
	
	@Override
	public void foo2(){
		System.out.println("default void foo2() from TestOnString");	
	}
	
	public static void foo3(){
		System.out.println("static void foo3() from base");
	}
	
		/*int i=2,j=0;
		j=++i;
		System.out.println("i = "+i+" and j = "+j);
		j=i++;
		System.out.println("i = "+i+" and j = "+j);*/
		
}
