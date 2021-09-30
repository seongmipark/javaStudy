import java.util.Scanner;
class Exam07{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   int comp, Cpro, eng, math, avg;
   System.out.println("컴퓨터 개론 과목의 점수를 입력하시오");
   comp = sc.nextInt();
   System.out.println("C언어 프로그래밍 과목의 점수를 입력하시오");
   Cpro = sc.nextInt();
   System.out.println("영어 과목의 점수를 입력하시오");
   eng = sc.nextInt();
   System.out.println("일반수학 과목의 점수를 입력하시오");
   math = sc.nextInt();
   avg = (comp+Cpro+eng+math)/4;
   System.out.println("평균점수는"+avg+"입니다.");
   }
}