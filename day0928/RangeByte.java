class RangeByte 
{
	public static void main(String[] args) 
	{

	byte data;
	data = -128;
	System.out.println(data);
	data = (byte)(data - 1);//�ּҰ��� ��ġ�� ��� underFlow�� �ƴ�
	System.out.println(data);


	/*data = 127;
	System.out.println(data);
	data = (byte)(data+1);//�ִ밪�� ��ġ�� ��� overFlow�� �ƴ�
	System.out.println(data);*/


	}
}
