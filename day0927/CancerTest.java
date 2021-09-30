//정부에서 매년 40세 이상 사람들에게 무료암검진을 실시한다.
//이름과 나이를 입력받아 무료암검진 대상자인지 판별하여 결과출력  

import java.util.Scanner;
class Checkpeople{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   String name;
   int age;
   System.out.println("이름은?");
   name=sc.next();
   System.out.println("나이은?");
   age=sc.nextInt();
   if (age>=40)
   System.out.println(name+"님은 무료암검진 대상자입니다");
   else
   System.out.println(name+"님은 무료암검진 대상자가 아닙니다");
   
   }
}