package sec11.practice;

class Speaker {
    String getName() {
        return "스피커";
    }
}

class RedSpeaker extends Speaker {
@Override
String getName() {
        return "빨간 스피커";
    }
}

class BlueSpeaker extends Speaker {
String getName() {
     return "파란 스피커";
          
        }
    }

    class Person {
        Speaker speaker;

        Person(Speaker speaker) {
            this.speaker = speaker;
        }

        void turnOn() {
            System.out.println(speaker.getName() + "가 켜졌습니다.");
        }
    }

    // 빨간 스피커가 켜졌습니다.
    // 파란 스피커가 켜졌습니다.
public class P1103 {
    public static void main(String[] args) {
        Speaker s1 = new RedSpeaker();
        Person p1 = new Person(s1);
        p1.turnOn();

        Speaker s2 = new BlueSpeaker();
        Person p2 = new Person(s2);
        p2.turnOn();
    }
}
