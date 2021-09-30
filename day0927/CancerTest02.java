//이름과 출생연도를 입력받아 나이를 계산하고 나이가 40살이상인지 판별하여
//무료암검진 대상자인지 결과 출력하도록 수정 (올해 2021년으로 정해두고, 나이 2021-출생년도)

import java.util.Scanner;
class Checkpeople02{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   String name;
   int userYear,age;
   int thisYear;
   thisYear=2021;
   System.out.println("이름은?");
   name=sc.next();
   System.out.println("출생년도는?");
   userYear=sc.nextInt();
   age = thisYear-userYear;
   if (age>=40)
   System.out.println(name+"님은 올해 "+age+"세입니다. 무료암검진 대상자입니다.");
   else
   System.out.println(name+"님은 올해 "+age+"세입니다. 무료암검진 대상자가 아닙니다.");
   
   }
}