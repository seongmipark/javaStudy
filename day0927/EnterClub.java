//����) ȫ�뿡 �ִ� �ֿ�Ŭ������ �������� ���Ͽ� �̸�, ���̿� Ű�� �Է¹޾� ��������.
//���̰� 20���̻��̰� Ű�� 160�����̸� "���尡��" �׷��������� "����Ұ���" ���


import java.util.Scanner;

class EnterClub{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   String name;
   int age,height;
   System.out.println("�̸���?");
   name=sc.next();
   System.out.println("���̴�?");
   age=sc.nextInt();
   System.out.println("Ű��?");
   height=sc.nextInt();


   if (age>=20 && height<=160)
   System.out.println(name+"���� ���� "+age+"���̰� Ű��"+height+"�Դϴ�. ���԰����Դϴ�.");
   else
   System.out.println(name+"���� ���� "+age+"���̰� Ű��"+height+"�Դϴ�. ���ԺҰ����Դϴ�.");

    }
}