class SwapTestInt
{
	public static void main(String[] args) 
	{
		int a=7;
		int b=4;

		System.out.println("a="+a);
		System.out.println("b="+b);
		
		/*int temp; //�¹ٲ���ϴ� �ڷ������� ������ ������ش�!
		temp = a;
		a = b;
		b = temp;*/
		//int���� �ӽú��� temp�� �������ʾƵ� ���� �ٲܼ��ִ¹�����մ�.

		a = a^b;
		b = b^a;
		a = a^b;

		System.out.println("a�� b�� ���� ���� �ٲپ����ϴ�");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}

