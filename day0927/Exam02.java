//변수수식과연산자 2번문제

import java.util.Scanner;
class Exam02{
public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   double x,r;
   System.out.println("실수 x값은?");
   x = sc.nextDouble();
  // r=(3*x*x*x)-(7*x*x)+9;
   r = 3*Math.pow(x,3) - 7*Math.pow(x,2) +9;
   System.out.println("결과="+r);
   }
}