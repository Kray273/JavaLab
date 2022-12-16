package Day112;
class StringComparator{
    String str1;
    String str2;
    boolean isLength;

    int compare(String str1, String str2, boolean isLength) {
        return 0;
    }

}

public class StringExample {
    StringComparator comparator = new StringComparator();
    comparator.compare("javaprogram", "oracle", true);
    comparator.compare("javaprogram", "oracledatabase", false);

    String url = "http://www.kitri.re.kr:8080/java/test";

    String data = "지금 저는 ㅋㅋㅋ 수업중입니다. 정말요? 과제물도 ㅎㅎㅎ 하고 있구요.";
    String delResult2 = de  leteChar(data, new String[]{".", "ㅋ", "ㅎ","?", " "});
    System.out.println("===> " + delResult2);
}
