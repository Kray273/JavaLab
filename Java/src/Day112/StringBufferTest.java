package Day112;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("초기값");
        StringBuffer sb3 = new StringBuffer(100);
        System.out.println("sb1의 용량 = " + sb1.capacity());
        System.out.println("sb2의 용량 = " + sb2.capacity());
        System.out.println("sb3의 용량 = " + sb3.capacity());

        System.out.println("sb1의 문자열 갯수 = " + sb1.length());
        System.out.println("sb2의 문자열 갯수 = " + sb2.length());
        System.out.println("sb3의 문자열 갯수 = " + sb3.length());
        sb2.append("추가한값");
        sb2.append("추가한값");
        sb2.append("추가한값");
        sb2.append("추가한값");
        sb2.append("추가한값");
        System.out.println("문자열 추가 후 sb2의 용량 = " + sb2.capacity());

        System.out.println("삭제전 sb2의 문자열 갯수 = " + sb2.length());
        sb2.delete(0,10); //0번부터 9번 인덱스까지 (10개의 문자 삭제)
        System.out.println("삭제후 문자열 갯수 = " + sb2.length());

        System.out.println(sb2.reverse()); //문자열을 역순으로

        String s2 = new String("초기값");
        System.out.println(s2.length());
        System.out.println(s2 + "추가한값");
        System.out.println(s2.length());
    }
}
