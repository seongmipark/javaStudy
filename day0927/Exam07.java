import java.util.Scanner;
class Exam07{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   int comp, Cpro, eng, math, avg;
   System.out.println("��ǻ�� ���� ������ ������ �Է��Ͻÿ�");
   comp = sc.nextInt();
   System.out.println("C��� ���α׷��� ������ ������ �Է��Ͻÿ�");
   Cpro = sc.nextInt();
   System.out.println("���� ������ ������ �Է��Ͻÿ�");
   eng = sc.nextInt();
   System.out.println("�Ϲݼ��� ������ ������ �Է��Ͻÿ�");
   math = sc.nextInt();
   avg = (comp+Cpro+eng+math)/4;
   System.out.println("���������"+avg+"�Դϴ�.");
   }
}