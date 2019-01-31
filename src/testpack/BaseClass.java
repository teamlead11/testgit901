``package testpack;
import java.util.Arrays;

public class BaseClass {

	public static void main(String[] args) {
		
		baseClassmethod();
		BaseClass b = new BaseClass();
		b.arraySortByKarty();
		b.add(4, 5);
		b.add(1, 2, 3);
		b.add(4, 6, 7, 8);
		b.sorting();
		baseClassmethod1();
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
	
public void arraySortByKarty() {
		
		int[] i= {1,78,3,100,5,7,0};
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));						
	}


	public void add(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
				
	}
		public void sorting() {
			int[] i= {66,22,77,44,55,11,33};
			Arrays.sort(i);
			System.out.println(Arrays.toString(i));
		}
		public void arraySortByBidisha() {
			
			int[] i= {1,8,3,90,9,7,0};
			Arrays.sort(i);
			System.out.println(Arrays.toString(i));						
		}	
		public void arraySortByMamta() {
			
			int[] k= {20,10,5,90,50,30};
			Arrays.sort(k);
			System.out.println("Array Is:" + Arrays.toString(k));						
		}	
		
	}



