//연습)두사람의 나이를 입력받아 서로 같은지 판별하여 적합한 메세지를 출력.

import java.util.Scanner;
class Practice02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age1,age2;

		System.out.print("A의 나이는?==>");
		age1 = sc.nextInt();
		System.out.print("B의 나이는?==>");
		age2 = sc.nextInt();

		if(age1 == age2)
			System.out.println("두사람의 나이는 같습니다.");
		else
			System.out.println("두사람의 나이는 다릅니다.");
	}
}
