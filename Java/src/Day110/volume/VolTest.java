package Day110.volume;

class Speaker implements Volume{
    int volLevel;
    public Speaker(int vol) {
        volLevel = vol;
    }

    @Override
    public void volumeUp(int volume) {
        System.out.println("현재 볼륨은 : " + volLevel);
        Volume.print1("Speaker");
        volLevel += volume;
        if (volLevel >= 100){
            volLevel = 100;
            System.out.printf("SpeakerLevel is %d\n",volLevel);
        } else {
            System.out.printf("SpeakerLevel is %d\n",volLevel);
        }
    }

    @Override
    public void volumeDown(int volume) {
        volLevel -= volume;
        Volume.print2("Speaker");
        if (volLevel <= -100){
            volLevel = -100;
            System.out.printf("SpeakerLevel is %d\n",volLevel);
        } else {
            System.out.printf("SpeakerLevel is %d\n",volLevel);
        }
    }
} // class
class Radio  implements Volume{
    int volLevel;
    public Radio(int vol) {
        volLevel = vol;
    }

    @Override
    public void volumeUp(int volume) {
        System.out.println("현재 볼륨은 : " + volLevel);
        Volume.print1("Radio");
        volLevel += volume;
        System.out.printf("radioLevel is %d\n", volLevel);
    }

    @Override
    public void volumeDown(int volume) {
        volLevel -= volume;
        Volume.print2("Radio");
        System.out.printf("radioLevel is %d\n", volLevel);
    }
}
class TV implements Volume{
    int volLevel;
    public TV(int vol) {
        volLevel = vol;
    }

    @Override
    public void volumeUp(int volume) {
        System.out.println("현재 볼륨은 : " + volLevel);
        Volume.print1("TV");
        volLevel += volume;
        System.out.printf("tvLevel is %d\n",volLevel);
    }

    @Override
    public void volumeDown(int volume) {

        Volume.print2("TV");
        volLevel -= volume;
        if (volLevel < 0){
            volLevel = 0;
            System.out.printf("tvLevel is %d\n", volLevel);
        } else {
            System.out.printf("tvLevel is %d\n", volLevel);
        }
    }
}


public class VolTest {
    public static void main(String[] args) {
        Volume[] v = new Volume[3];
        //서로 다른 클래스의 관계를 맺어준다.(클래스)
        v[0] = new Speaker(50);
        v[1] = new TV(40);
        v[2] = new Radio(30);
        for (Volume volume : v) {
            volume.volumeUp(200);
            volume.volumeDown(300);
        }
        v[0].print3();
    }//main
} // end class
