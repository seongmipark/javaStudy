//연습) 사용자한테 문자열을 입력받아 입력한 문자열에 소문자 'o'의 수를 파악하여 출력 
import java.util.Scanner;
class Practice01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		char ch;
		int cnt = 0;

		System.out.println("문자열을 입력하세요");
		data = sc.next();
		for(int i=0;i<data.length();i=i+1){
		  ch = data.charAt(i);
		if (ch == 'o')
			cnt = cnt +1;
	}

	System.out.println("소문자 o의 개수는 "+cnt+"개 입니다.");
	}
}