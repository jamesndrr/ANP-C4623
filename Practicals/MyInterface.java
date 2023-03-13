package corejava;

public interface MyInterface {
public void doSomething();
}
class MyClass implements MyInterface{
	public void doSomething() {
		System.out.println("Doing Something!");
	}
}
class MyMain {
	public static void main(String[]args) {
		MyClass a=new MyClass();
		a.doSomething();
	}
}
