

import java.util.Scanner;
class Exam09
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a;
		int t, h ,ten, one;
		System.out.println("10000������ a�� ���� �Է��ϼ���==>");
		a = sc.nextInt();

		t = a/1000;
		h = (a%1000) / 100;
		ten = (a%100) / 10;
		one = a % 10 ;

		if (a>10000)
		System.out.println("10000������ n�� ���� �Է��ϼ���");
		else {
		System.out.println("õ���ڸ�:"+t);
		System.out.println("�����ڸ�:"+h);
		System.out.println("�����ڸ�:"+ten);
		System.out.println("�����ڸ�:"+one);}
	}
			
}