//연습 사용자한테 문자열을 입력받아 문자열의 길이가 4글자이상인지 true,false를 출력

import java.util.Scanner;
class Practice02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("문자열을 입력하세요");
		data = sc.next();

		boolean result;
		result = data.length() >= 4;
			System.out.println(result);

	}
}
