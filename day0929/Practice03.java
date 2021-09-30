//연습)학생의 이름,국어,영어,수학을 입력받아 국어점수가 90점 이상이고, 평균점수가 90점 이상이면
//장학금을 지급하려고한다. 장학금 지금여부를 판별하는 프로그램 작성.


import java.util.Scanner;
class Practice03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,math,tot;
		double avg;

		System.out.print("이름을 입력하세요==>");
		name = sc.next();
		System.out.print("국어점수를 입력하세요==>");
		kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요==>");
		eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요==>");
		math = sc.nextInt();

		tot = kor + eng + math;
		avg = (double)tot/3;

		if(kor>=90 && avg>=90)
			System.out.println("장학금 지급 대상자입니다.");
		else
			System.out.println("장학금 지급 대상자가 아닙니다.");
	}
}
