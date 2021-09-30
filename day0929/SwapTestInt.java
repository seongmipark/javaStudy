class SwapTestInt
{
	public static void main(String[] args) 
	{
		int a=7;
		int b=4;

		System.out.println("a="+a);
		System.out.println("b="+b);
		
		/*int temp; //맞바꿔야하는 자료형으로 변수를 만들어준다!
		temp = a;
		a = b;
		b = temp;*/
		//int형은 임시변수 temp를 만들지않아도 서로 바꿀수있는방법이잇다.

		a = a^b;
		b = b^a;
		a = a^b;

		System.out.println("a와 b의 값을 서로 바꾸었습니다");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}

