package testpack;

import java.util.Arrays;

public class BaseClass {

	public static void main(String[] args) {
	BaseClass m=new BaseClass();
	m.baseClassmethod();
	m.baseClassmethod1();
	m.sorting();
	}

	public static void baseClassmethod() {
		System.out.println("this is my base class");
	}

	public static void baseClassmethod1() {
		System.out.println("this is my base class1");
	}
	public void sorting() {
	int[] i= {66,22,77,44,55,11,33};
	Arrays.sort(i);
	System.out.println(Arrays.toString(i));
	}

}
