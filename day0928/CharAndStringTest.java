class CharAndStringTest 
{
	public static void main(String[] args) 
	{
		//자바에서는 단일문자의 처리와 문자열의 처리가 다르다
		//하나의 문자를 표현하기 위해서는 홋따옴표로 묶어야하고
		//문자열을 처리하기 위해서는 쌍따옴표로 묶어야 한다.
		//만약 하나의 문자이지만 쌍따옴표로 묶었다면 char에 저장할수 없고
		//String으로 저장해야 한다.

	
		char firstName;
		firstName = '박';
		System.out.println(firstName);

		String name;
		name="박성미";
		System.out.println(name);

		//char lastName;
		String lastName;
		lastName="미";
		System.out.println(lastName);

		String data;
		data = "Hello";
		char last = data.charAt(4);
		//charAt은 String의 위치(index)에 있는 문자 하나를 알려주는 기능
		//위치(index)는 0부터 시작
		System.out.println("맨 마지막에 있는 문자는" +last+"입니다.");

	}
}
