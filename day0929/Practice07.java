//���� ����ڿ��� ������ �� N�� �Է¹޾� ¦������ Ȧ������ �Ǻ��ϴ� ���α׷��� ���׿����ڸ� �̿��Ͽ� �ۼ�

import java.util.Scanner;
class Practice07
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("���� n�� �Է��ϼ���==>");
		n = sc.nextInt();

		//System.out.println(n+"�� "+((n%2==0)?"¦��":"Ȧ��")  +"�Դϴ�.");
		String result =(n%2==0)?"¦��":"Ȧ��"; // ������� �ڷ����� ���� �տ� �ٿ�����.
		System.out.println(n+"�� "+ result +"�Դϴ�.");
	
	}
} 

