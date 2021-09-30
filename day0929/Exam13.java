

import java.util.Scanner;
class Exam13
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);


		double ac,ae,bc,de;
		System.out.print("ac의값?");
		ac = sc.nextDouble();
		System.out.print("ae의값?");
		ae = sc.nextDouble();
		System.out.print("bc의값?");
		bc = sc.nextDouble();

		de = (ac*ae)/bc;
		System.out.println("de의길이는"+de);
	}
} 