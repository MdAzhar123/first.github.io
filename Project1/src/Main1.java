import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
//import org.springframework.util.StringUtils;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of company");
		int n= sc.nextInt();
		String s = sc.nextLine();
		
		String[] s1 = new String[n];
		for(int i=0;i<n;i++)
		{
			s = sc.next();
			//s1[i]=s;
			list.add(s);
		}
		
		//System.out.println(list);
		
		// String commaDelimitedString = StringUtils.collectionToCommaDelimitedString(list);\
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			String ab=iterator.next();
			s1=ab.split("-");
			int num=Integer.parseInt(s1[1]);
			if(num%3==0)
			{
				iterator.remove();
				//System.out.println(list);
			}
			//System.out.println(list);
			System.out.println(iterator.next());
			
		}
		
	
			
		
		
		
	/*	for(String a:list)
		{
			s1=a.split("-");
			int num=Integer.parseInt(s1[1]);
			if(num%3==0)
			{
				list.remove(a);
			}
			System.out.println(list);
		}*/

		
		
		
		
	}

}
