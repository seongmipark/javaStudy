//정부에서 격년으로  나이가 40세이상인지 판별하여
//무료암검진 대상자인지 이름과 출생년도를 입력받아 결과 출력하도록 수정
//40세이상이고 올해 짝수연도이면 짝수년도에 태어난사람/홀수연도면 홀수연도에 태어난 사람이 대상자.

import java.util.Scanner;
import java.util.Date;

class CancerTest04{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   Date today = new Date();
   String name;
   int age, userYear, thisYear;
   thisYear=today.getYear()+1900;
   System.out.println("이름은?");
   name=sc.next();
   System.out.println("출생년도는?");
   userYear=sc.nextInt();
   age=thisYear-userYear;
   if(age>=40 && thisYear%2==userYear%2)
   System.out.println(name+"님은 올해 "+thisYear+"년도에 무료암검진 대상자입니다.");
   else
   System.out.println(name+"님은 올해 "+thisYear+"년도에 무료암검진 대상자가 아닙니다.");
   
   }
}