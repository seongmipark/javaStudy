//���ο��� �ų� 40�� �̻� ����鿡�� ����ϰ����� �ǽ��Ѵ�.
//�̸��� ���̸� �Է¹޾� ����ϰ��� ��������� �Ǻ��Ͽ� ������  

import java.util.Scanner;
class Checkpeople{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   String name;
   int age;
   System.out.println("�̸���?");
   name=sc.next();
   System.out.println("������?");
   age=sc.nextInt();
   if (age>=40)
   System.out.println(name+"���� ����ϰ��� ������Դϴ�");
   else
   System.out.println(name+"���� ����ϰ��� ����ڰ� �ƴմϴ�");
   
   }
}