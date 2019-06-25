import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int option=0;
		InternBO ibo = new InternBO();
		do
		{
			System.out.println("MENU");
			System.out.println("=====");
			System.out.println("1.Add new Intern");
			System.out.println("2.Print existing Intern");
			System.out.println("3.Remove Intern by Id");
			System.out.println("4.Sort by Age");
			System.out.println("5.Sort by Name");
			System.out.println("6.Exit the menu");
			System.out.println("Enter options(1-5)/6 to quit==>");
			option = sc.nextInt();
			
			switch(option)
			{
			case 1: 
				System.out.println("Enter name ");
				String name=sc.next();
				System.out.println("Enter batch ");
				String batch=sc.next();
				System.out.println("Enter age ");
				int age=sc.nextInt();
				System.out.println("Enter technology");
				String technology=sc.next();
				ibo.addIntern(name, batch, age, technology);
				break;
				
			case 2:
				  ibo.printInternDetails();
				  break;
				  
			case 3:
				  System.out.println("Enter the id to remove");
				  int id1=sc.nextInt();
				  ibo.removeIntern(id1);
				  break;
				  
				  
				  
			case 4: 
				   ibo.sortInternByAge();
				   break;
				   
			case 5:
				  ibo.sortInternByName();
				  break;
				   
				  
				  
			case 6:
				  break;
			default:
				 System.out.println("Invalid options, press (1-3)/4 TO QUIT");
			}
			
			
		}	while(option!=6);
		
		
		
	}

}
