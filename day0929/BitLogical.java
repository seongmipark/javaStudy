
import java.util.Scanner;
class BitLogical
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int age1,age2;
		System.out.print("A�� ���̴�?==>");
		age1 = sc.nextInt();
		System.out.print("B�� ���̴�?==>");
		age2 = sc.nextInt();

		//if(++age1 >=20 & ++age2 >=20 ) //��Ʈ�����ڴ� ���ǽ� �Ѵ� ������
		if(++age1 >=20 && ++age2 >=20 ) //�������ڴ� �� ���ǽ��� �����̸� �ڿ� ���ǽ��� ����.
			System.out.println("�λ���� ���̸� 1�� �����ϸ� ��� 20�� �̻��Դϴ�.");
		else
			System.out.println("�λ���� ���̸� 1�� �����ϸ� �λ�� ��� 20�� �̻��� �ƴմϴ�.");

	  System.out.println("age1:"+age1);
	  System.out.println("age2:"+age2);
	}
} 