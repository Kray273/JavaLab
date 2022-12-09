package Day107;
import java.util.Arrays;

class B{
    int m1(){
        int local =10;
        return local * 10;
    }
    int m2(int param){
        return param *10;
    }
    String m3(int param1, int param2){
        return param1 * param2 + "결과를 리턴합니다.";
    }
    int[] m4(int[] ar){
        int[] result = new int[ar.length];
        //ar 배열 각 요소에 *10 배열 저장 리턴
        for(int i = 0; i < ar.length; i++){
            result[i] = ar[i] * 10;
        }
        return result;
    }
    void m5(){ //void는 return이 없음! 항아리
        System.out.println("B클래스에서 test매서드를 테스트합니다.");
        //return; 있어도 되는데 값이 있음 error, 단지 종료한다는 뜻
    }

}
public class MethodTest {
    public static void main(String[] args) {
        B b1 = new B();
        int result = b1.m1();
        System.out.println(result); //100 결과는 바뀌지 않는다.
        System.out.println(b1.m2(5)); //50
        System.out.println(b1.m2(50)); //500
        System.out.println(b1.m3(6,8)); //String 리턴
        int[] main_ar = {10,20,45,1,99};
        int[] main_result = b1.m4(main_ar);
        System.out.println(Arrays.toString(main_result));//반복문 없이 배열값을 출력. import 필요
        //ctrl + alt + o 가 자동 import단축키
        b1.m5();
    }
}
