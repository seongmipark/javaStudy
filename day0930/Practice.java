//연습) 사용자한테 임의의 수 N을 입력받아 N이 양수이면 그수에 100을 더한 값을 출력하고 "작업종료"를 출력
//그렇지 않으면 그 수의 제곱을 출력한다음 "작업종료"를 출력하도록 프로그램 작성

import java.util.Scanner;
class Practice{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   int n;
   System.out.print("임의의 수 N을 입력하세요==>");
   n=sc.nextInt();
   if (n>=0){
     System.out.println(n+100);//a 
	 }else{
     System.out.println(n*n); //b
	 }
     System.out.println("작업종료"); //c   조건식이 참이면 a->c , 조건식이 거짓이면 b->c
   }
}