import java.util.Scanner;
class currencyconvertercutdecimal 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter amount in rupees");
		double inr = sc.nextDouble();
		rupeetodollar(inr);
	}

	public static void rupeetodollar(double rupee) 
	{
		double dollar = rupee/82.31;
		int a = (int) (dollar*100);
		System.out.println(a/100.0);
		dollartoeuro(a/100.0);
	}

	public static void dollartoeuro(double dollar) 
	{
		double euro = dollar*0.92;
		int a = (int) (euro*100);
		System.out.println(a/100.0);
		eurotodirham(a/100.0);
	}

	public static void eurotodirham(double euro) 
	{
		double dirham = euro*3.93;
		int a = (int) (dirham*100);
		System.out.println(a/100.0);
		dirhamtopound(a/100.0);
	}

	public static void dirhamtopound(double dirham) 
	{
		double pound = dirham*0.22;
		int a = (int) (pound*100);
		System.out.println(a/100.0);
	}

}
