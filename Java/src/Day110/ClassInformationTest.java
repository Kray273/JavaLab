package Day110;

public class ClassInformationTest {
    public static void main(String[] args){
        //java.lang.Object - 존재합니다.
        // chap8.A - 존재하지 않습니다.
        // Day110.CheckedTest - 존재합니다.
        try {
            Class.forName("java.lang.Object");
            Class.forName("chap8.A");
            Class.forName("Day110.CheckedTest");
        } catch (ClassNotFoundException e) {
            System.out.println("존재하지 않습니다.");
        }
    }
}
