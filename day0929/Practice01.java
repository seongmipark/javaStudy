//연습) 학생의 이름,국어,영어,수학을 입력받아 총점과 평균을 구하여 출력하고 평균이 60점 이상이면
//합격,그렇지않으면 불합격. (단 평균은 실수값으로 처리)


import java.util.Scanner;
class Practice01
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
		avg = (double)tot/3; //avg는 실수형, tot와 3은 정수이기때문에 tot or 3중 하나 실수로바꿔준다.
		//avg = tot/3.0; 
			
			System.out.println("이름:"+name);
			System.out.println("국어:"+kor);
			System.out.println("영어:"+eng);
			System.out.println("수학:"+math);
			System.out.println("총점:"+tot);
			System.out.println("평균:"+avg);

		if(avg>=60)
			System.out.println("합격입니다.");
		else
			System.out.println("불합격입니다.");
	}
}
