//����) ��������� �ΰ��� ������ �Է¹޾� ���ϱ�,����,���ϱ�,������ �� ����� ���

import java.util.Scanner;=class Calculate{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int a, b, add, minus, multiply, divided ;
    System.out.println("���� a ����?");
    a = sc.nextInt();
    System.out.println("���� b ����?");
    b = sc.nextInt();
    add = a+b;
    minus = a-b;
    multiply = a*b;
    divided = a/b;
      System.out.println("** ������ **");
      System.out.println("a+b="+add);
      System.out.println("a-b="+minus);
      System.out.println("a*b="+multiply);
      System.out.println("a/b="+divided);
    }
}