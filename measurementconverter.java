import java.util.Scanner;
class measurementconverter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter measurment in inch");
		double inch = sc.nextDouble();
		inchtocm(inch);
	}

	public static void inchtocm(double inch) 
	{
		double cm = inch*2.54;
		System.out.println(cm);
		cmtometer(cm);
	}

	public static void cmtometer(double cm) 
	{
		double meter = cm/100;
		System.out.println(meter);
		metertokm(meter); 
	}

	public static void metertokm(double meter) 
	{
		double km = meter/1000;
		System.out.println(km);
	}
}
