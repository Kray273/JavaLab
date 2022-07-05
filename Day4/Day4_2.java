package Day4;
//향상된 for문 stop의 기능을 줄인, 반드시 배열 또는 컬렉션의 형태여야함. 
public class Day4_2 {
public static void main(String[] args) {
    

    int[] arr = {10, 20, 30, 40, 50};
    
    //일반 for문
    // for(int i=0; i<=4; i++){ //자리수를 던진다
    //     System.out.println(arr[i]);
    // }
    
    //for each문
    for(int i : arr){ //값을 던진다
        System.out.println(i);
    }


}
}