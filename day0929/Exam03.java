//1파운드는 454그램. 몸무게를 파운드로 받아서 그램으로 환산하여 출력하는 프로그램을 작성.

import java.util.Scanner;
class Exam03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		/*double pound;
		System.out.print("몸무게(pound)를 입력하세요");
		pound = sc.nextDouble();*/

		double pound;
		System.out.print("몸무게(pound)를 입력하세요");
		pound = sc.nextDouble();

		double g;
		g = pound*454;
		System.out.println("몸무게는 "+ g +"g 입니다.");



	}
} 


