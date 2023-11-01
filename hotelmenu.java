import java.util.Scanner;
class hotelmenu
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("********welcome********");
		System.out.println("what do you prefer");
		System.out.println("1.veg");
		System.out.println("2.nonvej");
		int ip = sc.nextInt();
		switch (ip)
		{
		case 1:
			{   
			    System.out.println("your veg menu is:"); 
				System.out.println("1.pav bhaji-----100");
				System.out.println("2.dhokla--------50");
				System.out.println("3.misal---------80");
				System.out.println("4.paneer masala--------150");
				int vegip = sc.nextInt();
				switch (vegip)
				{
				case 1:
					{
						
						System.out.println("enter your quantity");
						int qty = sc.nextInt();
						System.out.println("your total bill is= "+(qty*100));
						break;
					}
				case 2:
					{
						
						System.out.println("enter your quantity");
						int qty = sc.nextInt();
						System.out.println("your total bill is= "+(qty*50));
						break;
					}
					case 3:
					{
						
						System.out.println("enter your quantity");
						int qty = sc.nextInt();
						System.out.println("your total bill is= "+(qty*80));
						break;
					}
					case 4:
					{
						
						System.out.println("enter your quantity");
						int qty = sc.nextInt();
						System.out.println("your total bill is= "+(qty*150));
						break;
					}
					default :
					{
						System.out.println("chala ja bhosdike");
					}

				
				}break;

			}

     case 2:
			{
				System.out.println("your nonveg menu is:"); 
				System.out.println("1.chicken lollipop-----150");
				System.out.println("2.egg biryani--------110");
				System.out.println("3.butter chicken---------210");
				System.out.println("4.mutton masala--------250");
				int nonvegip = sc.nextInt();
				switch (nonvegip)
				{
				case 1:
					{
						System.out.println("enter your quantity");
						int qty = sc.nextInt();
						System.out.println("your total bill is= "+(qty*150));
						break;
					}
					case 2:
					{
					   
						System.out.println("enter your quantity");
						int qty = sc.nextInt();
						System.out.println("your total bill is= "+(qty*110));
						break;	
					}
					case 3:
					{
						
						System.out.println("enter your quantity");
						int qty = sc.nextInt();
						System.out.println("your total bill is= "+(qty*210));
						break;
					}
			    	case 4:
					{
						
						System.out.println("enter your quantity");
						int qty = sc.nextInt();
						System.out.println("your total bill is= "+(qty*250));
						break;			
					}
					default :
					{
						System.out.println("chala ja bhosdike");
					}
				} break;
			}
			default :r
			{
				System.out.println("chala ja bhosdike");
			}
		
		}
	}
}