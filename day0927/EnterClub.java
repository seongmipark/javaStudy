//연습) 홍대에 있는 쌍용클럽에서 물관리를 위하여 이름, 나이와 키를 입력받아 입장제한.
//나이가 20세이상이고 키는 160이하이면 "입장가능" 그렇지않으면 "입장불가능" 출력


import java.util.Scanner;

class EnterClub{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);
   String name;
   int age,height;
   System.out.println("이름은?");
   name=sc.next();
   System.out.println("나이는?");
   age=sc.nextInt();
   System.out.println("키은?");
   height=sc.nextInt();


   if (age>=20 && height<=160)
   System.out.println(name+"님은 올해 "+age+"세이고 키는"+height+"입니다. 출입가능입니다.");
   else
   System.out.println(name+"님은 올해 "+age+"세이고 키는"+height+"입니다. 출입불가능입니다.");

    }
}