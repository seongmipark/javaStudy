//연습 사용자에게 임의의 수 N를 입력받아 짝수인지 홀수인지 판별하는 프로그램을 삼항연산자를 이용하여 작성

import java.util.Scanner;
class Practice07
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("숫자 n를 입력하세요==>");
		n = sc.nextInt();

		//System.out.println(n+"은 "+((n%2==0)?"짝수":"홀수")  +"입니다.");
		String result =(n%2==0)?"짝수":"홀수"; // 결과값의 자료형을 변수 앞에 붙여주자.
		System.out.println(n+"은 "+ result +"입니다.");
	
	}
} 

