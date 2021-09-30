//연습)구매수량이 10개이상이거나 구매금액이 20000원 이상이면 구매금액의 10%를 할인하려한다.
//상품명,단가,구매수량을 입력받아 구매금액을 계산하고 고객이 지급해야할 금액을 출력.


import java.util.Scanner;
class Practice04
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String product;
		int price,amount,total;

		System.out.print("상품명을 입력하세요==>");
		product = sc.next();
		System.out.print("단가를 입력하세요==>");
		price = sc.nextInt();
		System.out.print("구매수량을 입력하세요==>");
		amount = sc.nextInt();
		total = price*amount;

		
		System.out.println("상품명:"+product);
		System.out.println("단가:"+price);
		System.out.println("구매수량:"+amount);
		System.out.println("총금액:"+total);

		if(price>=20000 || amount>=10)
		System.out.println("10% 할인된"+(total*0.9)+"원을 지급하세요");
		else
		System.out.println(total+"원을 지급하세요");
	}

}