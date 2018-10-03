package test;

public class Sub implements Base{

	String show(int a){

    System.out.println("Sub class " + "Hi");

    return new String();

 }
	
	public void foo(){
System.out.println("public void foo()");		
	}
	
public int foo(int a,int b){
	System.out.println("int a,int b ="+(a+b));
	return a+b;
	}

public String foo(String str,String str2){
	System.out.println("String str,String str2 ="+str+str2);
	return str+str2;
}

@Override
public void foo1() {
	// TODO Auto-generated method stub
	
}

}
