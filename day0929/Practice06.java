//연습 사용자에게 두개의 정수를 입력받아 그중에 작은수를찾아 출력하는 프로그램을 삼항연산자를 이용하여 작성

import java.util.Scanner;
class Practice06
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a,b,min;
		System.out.print("정수 a를 입력하세요==>");
		a = sc.nextInt();
		System.out.print("정수 b를 입력하세요==>");
		b = sc.nextInt();
		min = (a<b)?a:b;

		System.out.println("작은수는 "+min+"입니다.");

	}

} 
