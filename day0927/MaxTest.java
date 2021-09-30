//두개의 정수를 입력받아 그중에 큰수를 찾아 출력
import java.util.Scanner;
class MaxTest{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int a, b, max;
     System.out.println("첫번째수는?==>");
     a=sc.nextInt();  
     System.out.println("두번째수는?==>");
     b=sc.nextInt();  
     if(a>b)
       max = a;
      else
       max = b;
      System.out.println("큰수는" +max+"입니다.");

   }

}