package aaa01;

public class Main0 {

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		greeter.setFormat("%s, 안녕!");
		String msg = greeter.greet("스프링");
		System.out.println(msg);
	}

}
