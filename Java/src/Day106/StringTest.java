package Day106;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java");

        if (s1 == s2){ //true
            System.out.println("s1 == s2 결과 같다.");
        }
        if (s3 == s4){//false
            System.out.println("s3 == s4 결과 같다.");
        } else if (s3 != s4) { //true
            System.out.println("s3 == s4 결과 같지않다.");
        }
        if (s1.equals(s2)){//true
            System.out.println("s1.equals(s2) 결과 같다.");
        }
        if (s3.equals(s4)){//true
            System.out.println("s3.equals(s4) 결과 같다.");
        }

        System.out.println("=================================");
        s2 = "jsp"; //명령형매개변수, 문자열 1번 메모리 생성 되어지는 순간
        if (s1 == s2){//false
            System.out.println("s1 == s1 결과 같다.");
        } else if (s1 != s2) { //true
            System.out.println("s1 == s2결과 같지않다.");
        }
    }
}
