//����:��������� ������ n�� �Է¹޾� �� ���� 6�� ������� �Ǻ��Ͽ� ������ ���

import java.util.Scanner;
class Practice04
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("���� n�� �Է��ϼ���==>");
		n = sc.nextInt();
		int mode = n%6;
		boolean result;

		result = mode == 0;
		System.out.println(result);

	}
}
