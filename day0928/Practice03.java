//연습 : 사용자한테 두개의 정수를 입력받아 사칙연산을 수행한 결과 출력

import java.util.Scanner;

class Practice03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("첫번째 수를 입력하시오==>");
		a = sc.nextInt();
		System.out.print("두번째 수를 입력하시오==>");
		b = sc.nextInt();

		int add = a + b;
		int sub = a - b;
		int multi = a * b;
		int div = a/b;
		int mode = a%b;

		System.out.println("오칙 연산 결과");
		System.out.println(a+"+"+b+"="+add);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"*"+b+"="+multi);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"%"+b+"="+mode);
	}
}
