//����)���ż����� 10���̻��̰ų� ���űݾ��� 20000�� �̻��̸� ���űݾ��� 10%�� �����Ϸ��Ѵ�.
//��ǰ��,�ܰ�,���ż����� �Է¹޾� ���űݾ��� ����ϰ� ���� �����ؾ��� �ݾ��� ���.


import java.util.Scanner;
class Practice04
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String product;
		int price,amount,total;

		System.out.print("��ǰ���� �Է��ϼ���==>");
		product = sc.next();
		System.out.print("�ܰ��� �Է��ϼ���==>");
		price = sc.nextInt();
		System.out.print("���ż����� �Է��ϼ���==>");
		amount = sc.nextInt();
		total = price*amount;

		
		System.out.println("��ǰ��:"+product);
		System.out.println("�ܰ�:"+price);
		System.out.println("���ż���:"+amount);
		System.out.println("�ѱݾ�:"+total);

		if(price>=20000 || amount>=10)
		System.out.println("10% ���ε�"+(total*0.9)+"���� �����ϼ���");
		else
		System.out.println(total+"���� �����ϼ���");
	}

}