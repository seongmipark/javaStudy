//연습)사용자한테 문자열을 입력받아 맨 첫번째 문자를 출력하자.

import java.util.Scanner;
class Practice
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("문자를 입력하세요");
		data = sc.next();
		char first = data.charAt(0);
		System.out.println("첫번째문자는"+first+"입니다.");

		//String first = data.charAt(0)+""; //String으로만들기위해서는 +""
		//String first = data.substring(0,1);
		//System.out.println("첫번째문자는"+first+"입니다.");
	
	}
}
