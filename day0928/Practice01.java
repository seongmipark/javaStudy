//����) ��������� ���ڿ��� �Է¹޾� �Է��� ���ڿ��� �ҹ��� 'o'�� ���� �ľ��Ͽ� ��� 
import java.util.Scanner;
class Practice01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		char ch;
		int cnt = 0;

		System.out.println("���ڿ��� �Է��ϼ���");
		data = sc.next();
		for(int i=0;i<data.length();i=i+1){
		  ch = data.charAt(i);
		if (ch == 'o')
			cnt = cnt +1;
	}

	System.out.println("�ҹ��� o�� ������ "+cnt+"�� �Դϴ�.");
	}
}