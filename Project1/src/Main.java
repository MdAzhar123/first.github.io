import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		ArrayList list1= new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  size of first Array ");
		
		int m= sc.nextInt();
		
		System.out.println("Enter values for 1st array");
		
		for(int i=0; i<m;i++)
		{
			int m1=sc.nextInt();
			list.add(m1);
			
		}
		//System.out.println(list);
		
		System.out.println("Enter  size of second Array ");
		
		int n= sc.nextInt();
		
		System.out.println("Enter values for 2nd array");
		
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			list1.add(n1);
		}
	//	System.out.println(list1);
		
		list.removeAll(list1);
		
		System.out.println(list);
		
		Object[] a= list.toArray();
		for(Object a1:a)
		{
			System.out.print(a1+" ");
		}
		
		
	}

}

