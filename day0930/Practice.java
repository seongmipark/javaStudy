//����) ��������� ������ �� N�� �Է¹޾� N�� ����̸� �׼��� 100�� ���� ���� ����ϰ� "�۾�����"�� ���
//�׷��� ������ �� ���� ������ ����Ѵ��� "�۾�����"�� ����ϵ��� ���α׷� �ۼ�

import java.util.Scanner;
class Practice{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   int n;
   System.out.print("������ �� N�� �Է��ϼ���==>");
   n=sc.nextInt();
   if (n>=0){
     System.out.println(n+100);//a 
	 }else{
     System.out.println(n*n); //b
	 }
     System.out.println("�۾�����"); //c   ���ǽ��� ���̸� a->c , ���ǽ��� �����̸� b->c
   }
}