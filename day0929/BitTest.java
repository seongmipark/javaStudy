
class BitTest
{
	public static void main(String[] args) 
	{
		String product;
		int a=10;  //00001010
		int b=20;  //00010100
		int i=a&b; //00000000
		int j=a|b; //00011110
		int k=a^b; //00011110

		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("k="+k);


	}

}
