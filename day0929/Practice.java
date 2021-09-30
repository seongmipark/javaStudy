//연습) 사용자한테 두개의 정수를 입력받아 그 중에 작은 수를 찾아 출력

import java.util.Scanner;
class Practice
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("정수a를 입력하세요==>");
		a = sc.nextInt();
		System.out.print("정수b를 입력하세요==>");
		b = sc.nextInt();

		if(a>b)
			System.out.println("작은 수는"+b+"입니다");
		else
			System.out.println("작은 수는"+a+"입니다");
	}
}
