//연습 두사람의 나이를 입력받아 두사람 모두 20살이상인지 판별하여 메세지 출력
//(단. 비트연산자를 논리연산자로 이용)

import java.util.Scanner;
class Practice05
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int age1,age2;
		System.out.print("A의 나이는?==>");
		age1 = sc.nextInt();
		System.out.print("B의 나이는?==>");
		age2 = sc.nextInt();

		if(age1 >=20 & age2 >=20 )
			System.out.println("두사람 모두 20살 이상입니다.");
		else
			System.out.println("두사람 모두 20살 이상은 아닙니다.");
	}

} 
