class DataTypeTest 
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
		int age;
		//long age;
		age = 28;
		System.out.println("�ڼ����� ����:"+age+"���Դϴ�.");

		//double height;
		float height;
		//height = 166.8f;//�Ǽ����� float������ �����ϱ� ���ؼ��� ���̻�f
		height = (float)166.8;//�ڷ��� ��ȯ�� �Ͽ� ������ �� �ִ�

		System.out.println("�ڼ����� Ű:"+height);

		char gender;
		gender='F';
		//gender="F"; //�ֵ���ǥ�� ������ ���ڿ�(String)���� ����Ͽ� char�� ����x
		System.out.println("�ڼ����� ������:"+gender);

		boolean isVaccine;
		isVaccine = true;
		System.out.println("�ڼ����� 1����� ��������:"+isVaccine);
	}
}
