package Day16;

public class Sample5 {
	public static void main(String[] args) {
		int[] arr = {4,2,3,5,1};
		int i;
		for (i = 0; i < arr.length; i++) {
			if (5 == arr[i]) {
				System.out.println("찾는 값은 "+ (i+1) + "번째에 있습니다."); 
				//배열은 0번쨰에서 시작 i+1
				break;
			}
		}
		if (i == arr.length) {
				System.out.println("값은 찾지 못했습니다.");
		}
	}
}
