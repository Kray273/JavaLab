package Day110.volume;

public interface Volume {
    void volumeUp(int volume);
    void volumeDown(int volume);
    static void print1(String name){
        System.out.println(name + " 클래스가 볼륨업 수행중입니다.");
    }
    static void print2(String name){
        System.out.println(name + " 클래스가 다운을 수행중입니다.");
    }
    default void print3(){
        System.out.println("뒤늦은 매서드 추가 - 자식클래스");
    }
}//interface

