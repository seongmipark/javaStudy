class CompoundOperatorTest
{
	public static void main(String[] args) 
	{

		int i= 1;
		int sum = 0;


		//�ݺ���
		//for( i=1  ;  i<=3 ; i++ ){
		for( i=1  ;  i<=100 ; i++ ){
		   sum += i; 
		}

		/*sum += i; // sum=sum+i ==>sum=1�̵�
		
		i++; // i=i+1 -->i�� ���´�1 ���� 2
		sum+=i;//sum=sum+i ==>1+2=3 sum=3

		i++; // i=2 ==? 2+1 ==> i=3
		sum+=i; // sum+i 3+3=6*/

		System.out.println("i:"+ i);     //3
		System.out.println("sum:"+ sum);  //6
	
	}
} 