//���ο��� �ݳ�����  ���̰� 40���̻����� �Ǻ��Ͽ�
//����ϰ��� ��������� �̸��� ����⵵�� �Է¹޾� ��� ����ϵ��� ����
//40���̻��̰� ���� ¦�������̸� ¦���⵵�� �¾���/Ȧ�������� Ȧ�������� �¾ ����� �����.

import java.util.Scanner;
import java.util.Date;

class CancerTest04{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   Date today = new Date();
   String name;
   int age, userYear, thisYear;
   thisYear=today.getYear()+1900;
   System.out.println("�̸���?");
   name=sc.next();
   System.out.println("����⵵��?");
   userYear=sc.nextInt();
   age=thisYear-userYear;
   if(age>=40 && thisYear%2==userYear%2)
   System.out.println(name+"���� ���� "+thisYear+"�⵵�� ����ϰ��� ������Դϴ�.");
   else
   System.out.println(name+"���� ���� "+thisYear+"�⵵�� ����ϰ��� ����ڰ� �ƴմϴ�.");
   
   }
}