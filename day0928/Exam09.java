

import java.util.Scanner;
class Exam09
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a;
		int t, h ,ten, one;
		System.out.println("10000이하의 a의 값을 입력하세요==>");
		a = sc.nextInt();

		t = a/1000;
		h = (a%1000) / 100;
		ten = (a%100) / 10;
		one = a % 10 ;

		if (a>10000)
		System.out.println("10000이하의 n의 값을 입력하세요");
		else {
		System.out.println("천의자리:"+t);
		System.out.println("백의자리:"+h);
		System.out.println("십의자리:"+ten);
		System.out.println("일의자리:"+one);}
	}
			
}
