//�̸��� ��������� �Է¹޾� ���̸� ����ϰ� ���̰� 40���̻����� �Ǻ��Ͽ�
//����ϰ��� ��������� ��� ����ϵ��� ���� (���� 2021������ ���صΰ�, ���� 2021-����⵵)

import java.util.Scanner;
class Checkpeople02{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   String name;
   int userYear,age;
   int thisYear;
   thisYear=2021;
   System.out.println("�̸���?");
   name=sc.next();
   System.out.println("����⵵��?");
   userYear=sc.nextInt();
   age = thisYear-userYear;
   if (age>=40)
   System.out.println(name+"���� ���� "+age+"���Դϴ�. ����ϰ��� ������Դϴ�.");
   else
   System.out.println(name+"���� ���� "+age+"���Դϴ�. ����ϰ��� ����ڰ� �ƴմϴ�.");
   
   }
}