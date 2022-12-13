package Day108;
abstract class Bird {
    String name;
    int legs;
    int length; //몸길이

    abstract void fly();
    abstract void sing();
    abstract void print();

    void setName(String s) {
        this.name = s;
    }

    String getName() {
        return name;
    }

    public void out(String s) {
        System.out.println(s);
    }
}

class Duck extends Bird{
    private static String species = "오리";
    int web; //물갈퀴수

    void swim(int web) {
        out(species+"("+name+")가 "+web+"개의 물갈퀴로 수영을 합니다.");
    }

    void fly() {
        out(species+"("+name+")는 날지 않습니다.");
    }

    void sing() {
        out(species+"("+name+")는 소리내어 웁니다");
    }

    void print() {
        out(species+"의 이름은 "+name+" 입니다.");
    }
}

class Sparrow extends Bird{
    String friend;

    void makeFriend() {
        friend = "허수아비";
        out("참새의 친구는 "+friend+"입니다.");
    }
    void fly() {
        out("참새("+name+")가 날아다닙니다.");
    }

    void sing() {
        out("참새("+name+")가 소리내어 웁니다");
    }

    void print() {
        out("참새의 이름은 "+name+" 입니다.");
    }
}

class PlayBird {
    public static void main(String args[] ){

        Duck D = new Duck();
        D.setName("꽥꽥이");
        D.fly();
        D.sing();
        D.swim(2);
        D.print();

        Sparrow S = new Sparrow();
        S.setName("짹쨱");
        S.fly();
        S.sing();
        S.makeFriend();
        S.print();
    }
}
