import java.util.Random;
class ShiftThreeRandomTest
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int n = rand.nextInt(); //Random�� nextInt();�� Int�� ���� �� �� �������� �����ϰ� ���ش�.
		System.out.println(n);

		//0���� 9������ ������ �߻��ϵ��� ���α׷��� ����
		n = n>>>1;// ������ ����� ������ش�
		n = n%10; // ex)56342%10���ϸ� 2�� ��µɰ�.
		System.out.println(n);
	}
} 