class IntAndDoubleTest 
{
	public static void main(String[] args) 
	{
		//정수와 정수를 연산하면 결과가 정수가 된다
		//만약 정수와 정수를 연산하여 실수값을 갖기를 원한다면
		//정수중 하나를 실수로 형변환하여 연산해야한다

		int a=5;
		int b=2; //초기값을 설정한다

		double result ;
		//result = a/b;
		result = a/(double)b;
		System.out.println("나누기 결과:"+result);
	}
}
