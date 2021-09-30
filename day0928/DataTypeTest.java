class DataTypeTest 
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
		int age;
		//long age;
		age = 28;
		System.out.println("박성미의 나이:"+age+"살입니다.");

		//double height;
		float height;
		//height = 166.8f;//실수값을 float변수에 저장하기 위해서는 접미사f
		height = (float)166.8;//자료형 변환을 하여 저장할 수 있다

		System.out.println("박성미의 키:"+height);

		char gender;
		gender='F';
		//gender="F"; //쌍따옴표로 묶으면 문자열(String)으로 취급하여 char에 저장x
		System.out.println("박성미의 성별은:"+gender);

		boolean isVaccine;
		isVaccine = true;
		System.out.println("박성미의 1차백신 접종여부:"+isVaccine);
	}
}
