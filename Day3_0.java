/* 
자료형에 대한 학습 22.7.4 3일차
*/




import java.util. *;
class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
// //자료형 입력
//   char ch = 'A';  //char ch = 65;
//   int code = (int) ch; // ch에 지정한 값을 int 타입으로 변환하여 저장, 형변환(케스팅)
//   System.out.printf("%c=%d(%#X) %n", ch, code, code); //(%#X) 16진수
//   char hch = '가';
//   System.out.printf("%c=%d(%#X) %n", hch, (int) hch, (int) hch);

    
// //자료형 입력2
//   float f = 9.12345678901234567890f;
//   float f2 = 1.2345678901234567890f;
//   double d = 9.12345678901234567890d;

//   System.out.printf("      123456789012345678901234%n");
//   System.out.printf("f   : %f%n", f); //소수점 이하 6자리까지 출력
//   System.out.printf("f   : %24.20f%n", f); //.점뒤에 숫자는 소숫점 아래 20개
//   System.out.printf("f2  : %24.20f%n", f2); //.점 앞에 숫자는 전체 자리수. 
//   System.out.printf("d  : %24.20f%n", d); //%n은 줄바꿈


// //나머지 연산자
//   int x = 10;
//   int y = 8;

//   System.out.printf("%d을 %d로 나누면, %n", x, y);
//   System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x / y, x % y);

// //String 문자열 여러글자를 담을때,
//   String str1 = "abc";
//   String str2 = new String("abc");
//   System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc" =="abc"); //글자를 비교할떄 \"\"를 쓴다.
//   System.out.printf("str1==\"abc\" ? %b%n", str1=="abc");
//   System.out.printf("str2==\"abc\" ? %b%n", str2=="abc");
//   System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
//   System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
//   System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
//   System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));

    
// //삼항 연산자
//     int x, y, z;
//     int absX, absY, absZ;
//     char signX, signY, signZ;
//     x = 10;
//     y = -5;
//     z = 0;
//     absX = x >= 0 ? x : -x; //x의 값이 음수이면, 양수로 만든다.
//     absY = y >= 0 ? y : -y;
//     absZ = z >= 0 ? z : -z;
//     signX = x >0 ? '+' : (x==0 ? ' ' : '-'); //조건연산자를 중첩
//     signY = y >0 ? '+' : (y==0 ? ' ' : '-');
//     signZ = z >0 ? '+' : (z==0 ? ' ' : '-');
//     System.out.printf("x=%c%d%n", signX, absX);
//     System.out.printf("y=%c%d%n", signY, absY);
//     System.out.printf("z=%c%d%n", signZ, absZ);


// //문제 삼항연산자, 실수 출력
//     System.out.println("정숫값 x, y, z의 평균을 구합니다.");
//     System.out.println("정숫값 x를 입력하세요 : ");
//     int x = stdIn.nextInt();
//     System.out.println("정숫값 y를 입력하세요 : ");   
//     int y = stdIn.nextInt();
//     System.out.println("정숫값 z를 입력하세요 : ");
//     int z = stdIn.nextInt();

//     double ave = (double) (x + y + z) / 3; //평균값
//     System.out.printf("x값 : %d%n", x);
//     System.out.printf("y값 : %d%n", y);
//     System.out.printf("z값 : %d%n", z);
//     System.out.printf("x,y,z의 평균은 %.3f 입니다.%n", ave); //표시


// //for문
//     for(int i=1;i<=5;i++)
//     System.out.println(i); // i의 값을 출력한다.
//     for(int i=1;i<=5;i++)
//     System.out.print(i);  // print() 를 쓰면 가로로 출력된다.
//     System.out.println();
    
// // for 변형
//     int sum = 0;  //반복문 전에 초기화 하고 들어가자 이후에 누적만 시킬수 있도록
//     for(int i=1; i <= 10; i++) {
//       sum += i; //sum = sum + i;
//       System.out.printf("1부터 %2d 까지의 합 : %2d%n", i, sum);
//     } 



    
  }
}
