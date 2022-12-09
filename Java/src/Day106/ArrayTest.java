package Day106;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("arr배열의 길이 = "+ arr.length);
        System.out.println("정수배열의 자동 초기화 값");
        for (int i = 0; i  < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

        System.out.println("\n정수배열의 사용자 저장값");
        for (int i = 0; i  < arr.length; i++) {
            arr[i] = (int)(Math.random() * 50) +1;
            System.out.print(arr[i] + "  ");
        }

        System.out.println("\n정수 배열의 최솟값과 최대값");
        /*
        int min = 51;
        int max = 0;

        //Search 로 찾기
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\n"+i);
            if (min > arr[i]) {
                min = arr[i];
                System.out.print("min : " + min + "  ");
            }
            if (max < arr[i]) {
                max = arr[i];
                System.out.print("max : "+ max + "  ");
            }
        }

        System.out.println("\nmin : " + min+", max : " + max);
        */

        //Sort로 찾기
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                arr[0] = arr[i];
            }
            System.out.println( i + "번째 반복 후" + arr[0]);
        }
        System.out.println("\n min : " + arr[0]);
    }
}
