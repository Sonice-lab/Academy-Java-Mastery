package sec19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getage() {
        return age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }
}

public class Ex19_15 {
    public static void main(String[] args) { // 인터넷에서 자료를 가지고 올 때 > 직렬화가 이루어짐

        Person p1 = new Person("김일남", 99);
        Person p2 = new Person("김이남", 98);

        FileOutputStream out = null;
        ObjectOutputStream oos = null;

        try {
            out = new FileOutputStream("C:\\Users\\사용자\\Desktop\\kdh\\VSC\\6_[260621]java.zip_260621\\[260621]java\\[260621]java\\src\\sec19\\\\object_data.dat");
            oos = new ObjectOutputStream(out);
            oos.writeObject(p1);
            oos.writeObject(p2);

        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (out != null) {
                    out.close();
                }

            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }
}
