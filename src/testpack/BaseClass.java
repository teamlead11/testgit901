package testpack;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseClassmethod();
		BaseClass b = new BaseClass();
		b.add(4, 5);
		b.add(1, 2, 3);
		b.add(4, 6, 7, 8);

	}

	public static void baseClassmethod() {
		System.out.println("this is my base class");
	}

	public static void baseClassmethod1() {
		System.out.println("this is my base class1");
	}
	
	public static void baseClassVinoth() {
		System.out.println("this is my base class2");
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public void add(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}
	
	
	
}

