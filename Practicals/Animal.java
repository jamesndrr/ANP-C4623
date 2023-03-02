package corejava;

public class Animal {
	//method 
		public void display() {
			System.out.println("Inside Parent Class");
		}
}
//child class
class Dog extends Animal 
{
	public void sound() {
		System.out.println("barks...");
	}
}
class Puppy extends Dog{
	public void run() {
		System.out.println("It runs slowly...");
	}
}
class Tester{
	public static void main(String[] args) 
	{
		Puppy a = new Puppy();//creating object of child class
		a.display();
		a.sound();
		a.run();
	}
}