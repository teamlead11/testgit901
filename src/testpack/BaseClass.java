package testpack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseClassmethod();
		BaseClass b = new BaseClass();
		b.add(4, 5);
		b.add(1, 2, 3);
		b.arraySortByKarty();
		

	}

	public static void baseClassmethod() {
		System.out.println("this is my base class");
	}

	public static void baseClassmethod1() {
		System.out.println("this is my base class1");
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public void arraySortByKarty() {
		
		int[] i= {1,78,3,100,5,7,0};
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
						
	}
}
