

import java.util.Scanner;
class Exam13
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);


		double ac,ae,bc,de;
		System.out.print("ac�ǰ�?");
		ac = sc.nextDouble();
		System.out.print("ae�ǰ�?");
		ae = sc.nextDouble();
		System.out.print("bc�ǰ�?");
		bc = sc.nextDouble();

		de = (ac*ae)/bc;
		System.out.println("de�Ǳ��̴�"+de);
	}
} 