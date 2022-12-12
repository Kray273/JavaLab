package Day108;
class Bird{
    private String species;
    private String name;
    int legs;
    int length;
    void fly(){

    }//fly()
    void sing(){

    }//sing()

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    void print(){

    }//pint()
}//class Bird

class Duck extends Bird{
    int wed;
    void swim(String name){

    }//swim()

}//class Duck

class Sparrow extends Bird{
    String friend;
    Sparrow(){
        this.friend = "허수아비";
    }
    void makeFriend(){
        System.out.printf("참새의 친구는 %s입니다.", friend);
    }
}//class Sparrow

public class PlayBird {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setName("꽥꽥이");
        duck.fly();
        duck.sing();
        duck.swim();
        duck.print();
        Sparrow sparrow = new Sparrow();
        sparrow.setName("짹쨱");
        sparrow.fly();
        sparrow.sing();
        sparrow.makeFriend();
        sparrow.print();
    }//main(args)
} // end class PlayBird
