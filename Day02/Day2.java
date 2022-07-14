package Day2;
/*Day2 IF에 대해서 22.07.01 by.Kray


//   */
import java.util. *;
class Main {
  public static void main(String[] args) {
 Scanner stdIn = new Scanner(System.in);

//복습
    
// //입력 받아 출력
    
//     System.out.println("정숫값.>");
//     int x = stdIn.nextInt();
//     String input = stdIn.nextLine();
//     System.out.println("정수값:" + x);
//     System.out.println("마지막 자릿수를 제외한 값은" + (x /10) + "입니다.");
//     System.out.println("마지막 자릿수는" + (x %10) + "입니다.");

// //두개의 숫자 입력 받아 변환 출력    
//     System.out.print("X값을 입력해주세요.:>"); //x값 입력 메시지 
//     double x = stdIn.nextDouble(); //입력한 실숫값을 x에 저장
//     System.out.print("Y값을 입력해주세요.:>"); //y값 입력 메시지 
//     double y = stdIn.nextDouble(); //입력한 실숫값을 y에 저장
//     System.out.println("합계는" + (x + y) + "입니다.");
//     System.out.println("평균은" + ((x + y) / 2) + "입니다.");   
   

// //삼갹형의 넓이를 구하시오.
//     System.out.println("삼각형의 넓이를 구합니다.");
//     System.out.print("밑변:");
//     double x = stdIn.nextDouble();
//     System.out.print("높이:");
//     double y = stdIn.nextDouble();
//     System.out.println("밑변:>" + x);
//     System.out.println("높이:>" + y);
//     System.out.println("넓이는" + ((x * y) / 2) + "입니다.");


// //IF 시작

//     int x = 0;
//     //정수형 변수 x에 초기값 0을 대임
//     System.out.printf("x=%d 일 때, 참인 것은 %n", x); 
//     // %d 자리표시자 d가 정수 
//     // 프린트 f를 사용한다.
//     //%n 개행문자 줄바꿈
//     if(x==0) {
//                 System.out.println("x==0");}
//     // if구문에서 true일 경우 실행하는 구문은 중괄호 표기하자. 블럭처리라고 함
//     if(x!=0) {  
//                 System.out.println("x!=0");  }
//     //
//     if(!(x==0)) {  
//                   System.out.println("!(x==0)");  }
//     //
//     if(!(x!=0)) {
//                     System.out.println("!(x!=0)");  }

// // //if 입력받아 판단 후 처리
//     int input;
//     System.out.println("숫자를 하나 입력하세요.>");
//     Scanner staIn = new Scanner(System.in);
//     String tmp = staIn.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
//     input = Integer.parseInt(tmp); //입력받은 문자열(tmp)를 숫자로 변환
//     if(input == 0) {
//       System.out.println("입력하신 숫자는 0입니다.");    }
//     if(input!=0) {
//       System.out.println("입력하신 숫자는 0이 아닙니다.");  
//       System.out.printf("입력하신 숫자는 %d입니다.", input); }

// //if 조건 만족하면 실행, 조건 만족하지 못할 때 실행   
//     System.out.print("숫자를 하나 입력하세요.>");
  
//     int input = stdIn.nextInt();
//     if (input == 0) {
//       System.out.println("입력하신 숫자는 0입니다.");
//     } else {input! == 0) {
//       System.out.printf("입력하신 숫자는 0이 아닙니다.", input); }    

         
// int input = a.nextInt();
// if(input % 2 == 0){
// System.out.println("입력하신 숫자는 짝수입니다.");
// } else {
// System.out.println("입력하신숫자는 홀수입니다.");
// }
// }


// //if 조건 홀수 짝수            수정
//    int input = stdIn.nextInt();
//     if ( (input/2)==0) {
//     System.out.println("입력하신 숫자는 짝수입니다."); }
//     else { (input!/2) = 0
//     System.out.println("입력하신 숫자는 홀수입니다."); }  

// 3의 배수의 경우 만들어야함   수정


// // 점수에 따른 학점 분배
//     int score = 0;  //점수를 저장하기 위한 변수
//     char grade = ' ';  //학점을 지정하기 위한 변수, 공백을 초기화 ''공백 넣기
//     System.out.println("점수를 입력하세요.>");
//     score = stdIn.nextInt(); //화면을 통해 입력받은 숫자를 score에 저장
//     if (score >= 90) { 
//       grade = 'A';   }
//     else if  (score >= 80) {  // 조건식2 
//         grade = 'B';  }    
//     else if (score >=70) {
//         grade = 'C';  }  
//     else {  //else가 있으면 마지막에 무조건 걸림
//        grade = 'D';  }  
//     System.out.println("당신의 학점은" + grade + "입니다."); 
         //불필요한 중복을 회피하는 것을 선호 


// // //중첩 if문 
//     int score = 0;
//     char grade = ' ';
//     char opt = ' ';
//     System.out.println("점수를 입력해주세요 : ");
//     score = stdIn.nextInt();
//     System.out.println("당신의 점수는" + score + "점입니다.");
//     System.out.printf("당신의 점수는 %d점입니다.%n", score);
//     if (score >=90) {
//       grade = 'A';
//       if (score >= 98){
//         opt = '+';
//       } else if (score >= 94){
//         opt = '0';
//       } else {
//         opt = '-';
//       }
//     } else if(score >= 80) {
//       grade = 'B';
//     } else if(score >= 70) {
//       grade = 'C';   
//     } else {
//       grade = 'D';   
//     }  
//     System.out.printf("당신의 학점은 %c%c입니다.", grade, opt);


// // switch문은 브레이크를 걸어줘야 한다. if는 하나 끝나면 빠져나가느데 switch는 여러개를 실행할 수 잇음.  

// //문자형 if
//     int score = 0;
//     String name;
//     System.out.println("현재 월을 입력하세요 : ");
//     score = stdIn.nextInt();
//     if (score <= 2 || score >= 12 ) {
//     // |와 ||의 차이는 하나면 앞에 따지고 두개면 앞뒤 변수를 다 따짐.
//       name = "겨울";
//     } else if (score <= 3 || score >= 5) {
//       name = "봄";
//     } else if (score <= 6 || score >= 8) {
//       name = "여름";
//     } else  {
//       name = "가을";
//     } 
//   System.out.printf("현재의 계절은 %s입니다.", name);

// //문자형을 switch문으로 
//     int month = 0;
//     String name;
//     System.out.println("현재 월을 입력하세요 : ");
//     month = stdIn.nextInt();
//     switch (month) {
//       case 1 : case 2 : case 12 :
//             System.out.print("현재의 계절은 겨울입니다.%n");
//       break;  
//       case 3 : case 4 : case 5 :
//             System.out.print("현재의 계절은 봄입니다.%n");
//       break;
//       case 6 : case 7 : case 8 :
//             System.out.print("현재의 계절은 여름입니다.%n");
//       break;
//       case 9 : case 10 : case 11 :
//             System.out.print("현재의 계절은 가을입니다.%n");
//       break;      


// //주민번호로 구별하기
//     String num = stdIn.nextLine();
//     System.out.println("당신의 주민번호를 입력해주세요 : ");
//     char gender = num.charAt(7);
//     // System.out.println(gender);
//     switch (gender) {
//         case '1' : case '3' :
//         System.out.print("당신의 성별은 남자 입니다."%n);
//         break;
//         case '2' : case '4' :
//         System.out.print("당신의 성별은 남자 입니다."%n);
//         break;
//         default;
//         System.out.prinlnt("잘못입력하셨습니다"%n);  
//     }

// //가위바위보 (난수처리 방법)
//     System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요 : ");
//     int num = stdIn.nextInt();

//     //난수발생
//         //난수는 0~1사이의 실수값으로 난수 발생이 기본이다.
//         // 캐스팅 -> 형변환Math 앞에 int 삽입 소숫점을 날림
//         // +1은 0이 나오는 경우의 수를 방지하기 위해, 1,2,3의 난수 발생
//     // System.out.println((int)Math.random()*3+1);
//     int com = (int)Math.random()*3+1;
//     System.out.printf("당신은 %d입니다.%n",num);
//     System.out.printf("컴은 %d입니다.%n",com);
    
//     if (num == com ) {
//       System.out.print("무승부 입니다.%n"); 
//     } else if (num == 1 && com == 3 ){
//       System.out.printf("당신의 승리입니다.%n");
//     }  else if (num == 2 && com == 1 ){
//       System.out.printf("당신의 승리입니다.%n");
//     } else if (num == 3 && com == 2 ){
//       System.out.printf("당신의 승리입니다.%n");
//     } else {
//       System.out.printf("컴의 승리입니다.%n"); 
//     }



// // 점수에 따른 학점 분배 switch문
//     int score = 0;   
//     System.out.println("점수를 입력하세요.>");
//     score = stdIn.nextInt(); 
//     switch (score/10) {
//       case 10: case 9: 
//       System.out.print("당신의 성적은 A입니다.");
//       break;
//       case 8:
//       System.out.print("당신의 성적은 B입니다.");
//       break;
//       case 7:
//       System.out.print("당신의 성적은 C입니다.");
//       break;
//       default:
//       System.out.println("당신의 성적은 D입니다.");
//     } 


// //주민번호로 구별하기
//     System.out.println("당신의 주민번호를 입력해주세요 : ");
//     String num = stdIn.nextLine();
//     char gender = num.charAt(7);
//     switch (gender) {
//         case '1' :
//         System.out.print("당신은 2000년 이전에 출생한 남자입니다");
//         break;
//         case '2' : 
//         System.out.print("당신은 2000년 이전에 출생한 여자입니다");
//         break;
//         case '3' :
//         System.out.print("당신은 2000년 이후에 출생한 남자입니다");
//         break;
//         case '4' : 
//         System.out.print("당신은 2000년 이전에 출생한 여자입니다");
//         break;
//         default:
//         System.out.println("잘못입력하셨습니다");  
//     }
    

    
     
    
  }
}
