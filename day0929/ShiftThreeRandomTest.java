import java.util.Random;
class ShiftThreeRandomTest
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int n = rand.nextInt(); //Random의 nextInt();는 Int의 범위 수 중 랜덤으로 등장하게 해준다.
		System.out.println(n);

		//0에서 9사이의 난수가 발생하도록 프로그램을 수정
		n = n>>>1;// 무조건 양수로 만들어준다
		n = n%10; // ex)56342%10을하면 2가 출력될것.
		System.out.println(n);
	}
} 