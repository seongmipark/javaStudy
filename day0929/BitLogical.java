
import java.util.Scanner;
class BitLogical
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int age1,age2;
		System.out.print("A의 나이는?==>");
		age1 = sc.nextInt();
		System.out.print("B의 나이는?==>");
		age2 = sc.nextInt();

		//if(++age1 >=20 & ++age2 >=20 ) //비트연산자는 조건식 둘다 따져봄
		if(++age1 >=20 && ++age2 >=20 ) //논린연산자는 앞 조건식이 거짓이면 뒤에 조건식은 무시.
			System.out.println("두사람의 나이를 1씩 증가하면 모두 20살 이상입니다.");
		else
			System.out.println("두사람의 나이를 1씩 증가하면 두사람 모두 20살 이상은 아닙니다.");

	  System.out.println("age1:"+age1);
	  System.out.println("age2:"+age2);
	}
} 