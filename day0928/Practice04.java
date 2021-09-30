//연습:사용자한테 임의의 n을 입력받아 그 수가 6의 배수인지 판별하여 논리값을 출력

import java.util.Scanner;
class Practice04
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("숫자 n을 입력하세요==>");
		n = sc.nextInt();
		int mode = n%6;
		boolean result;

		result = mode == 0;
		System.out.println(result);

	}
}
