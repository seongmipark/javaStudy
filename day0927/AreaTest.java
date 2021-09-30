//연습) 사용자한테 가로길이와 세로길이를 직접받아 사각형의 면적을 계산하여 출력하는 
//프로그램을 작성하고 저장 컴파일 실행 

import java.util.Scanner;
class AreaTest{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int width,height,area;
    System.out.println("가로길이 값은?");
    width = sc.nextInt();
    System.out.println("세로길이 값은?");
    height = sc.nextInt();
    area = width*height;
     System.out.println("면적"+area+"입니다");
   }
}
