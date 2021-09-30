class RangeByte 
{
	public static void main(String[] args) 
	{

	byte data;
	data = -128;
	System.out.println(data);
	data = (byte)(data - 1);//최소값을 넘치는 경우 underFlow가 됐다
	System.out.println(data);


	/*data = 127;
	System.out.println(data);
	data = (byte)(data+1);//최대값을 넘치는 경우 overFlow가 됐다
	System.out.println(data);*/


	}
}
