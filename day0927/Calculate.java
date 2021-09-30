//연습) 사용자한테 두개의 정수를 입력받아 더하기,빼기,곱하기,나누기 한 결과를 출력

import java.util.Scanner;=class Calculate{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int a, b, add, minus, multiply, divided ;
    System.out.println("정수 a 값은?");
    a = sc.nextInt();
    System.out.println("정수 b 값은?");
    b = sc.nextInt();
    add = a+b;
    minus = a-b;
    multiply = a*b;
    divided = a/b;
      System.out.println("** 결과출력 **");
      System.out.println("a+b="+add);
      System.out.println("a-b="+minus);
      System.out.println("a*b="+multiply);
      System.out.println("a/b="+divided);
    }
}