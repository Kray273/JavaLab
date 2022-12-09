package Day106;
import java.util.Arrays;
public class Test2 {
    public static void main(String[] args) {
        // 변수 최소 5 ~ 최대 10개(발생된 개수만큼)
        /*int count;
        while (true){
            count = (int)(Math.random()*10)+1;
            if(count >= 5) break;
        }*/
        int countMin = 5;
        int countMax = 10;
        int count = (int) (Math.random()*(countMax-countMin+1)) + countMin;
        //System.out.println(count);
        // 45 89 100 23 234 567 -> 23 45 ..
        int[] arr = new int[count];
        System.out.print("발생된 난수 : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*1000)+1;
            System.out.print(arr[i]+ "  ");
        }
        System.out.println();

        // 입력된 변수 갯수 오름차순 정렬 결과 출력
        // 작은값이 먼저~ 큰값~
        int temp;
        int min ;
        for(int i = 0; i < arr.length; i++) {
            min = i; //min에 임의의 최소값을 지정

            //최소값 넣기
            for (int j = i+1; j < arr.length; j++) { //0번 인덱스는 비교할 필요가 없음으로 i+1
                if(arr[j] < arr[min]) { // j인덱스 값과  min 인덱스 값과 비교하여 min이 크면
                    min = j; //min에 더 작은 j인덱스 값을 넣는다.
                }
            }

            //최소값을 제일 앞으로 보내기
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

            for (int each : arr) {
                System.out.print(each + " ");
            }
            System.out.println();
        }//for

        System.out.println("오름차순 정렬 결과 : " + Arrays.toString(arr));

    } //main
}//class
