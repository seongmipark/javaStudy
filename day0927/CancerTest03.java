//�̸��� ��������� �Է¹޾� ���̸� ����ϰ� ���̰� 40���̻����� �Ǻ��Ͽ�
//����ϰ��� ��������� ��� ����ϵ��� ���� (���� 2021������ ���صΰ�, ���� 2021-����⵵)

import java.util.Scanner;
import java.util.Date;
class Checkpeople03{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   Date today = new Date();
   String name;
   int userYear,age;
   int thisYear;
   thisYear=today.getYear()+1900;
   System.out.println("�̸���?");
   name=sc.next();
   System.out.println("����⵵��?");
   userYear=sc.nextInt();
   age = thisYear-userYear;
   System.out.println("���ش�"+thisYear+"�⵵�Դϴ�.");
   if (age>=40)
   System.out.println(name+"���� ���� "+age+"���Դϴ�. ����ϰ��� ������Դϴ�.");
   else
   System.out.println(name+"���� ���� "+age+"���Դϴ�. ����ϰ��� ����ڰ� �ƴմϴ�.");
   
   }
}