package sec19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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

    int getAge() {
        return age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }
}

public class Ex19_16 {
    public static void main(String[] args) { // 역직렬화

        FileInputStream input = null;
        ObjectInputStream ois = null;

        try {
            input = new FileInputStream("src\\sec19\\object_data.dat");
            ois = new ObjectInputStream(input);

            Person p1 = (Person) ois.readObject();
            System.out.println("이름: " + p1.getName());
            System.out.println("나이: " + p1.getAge());

            Person p2 = (Person) ois.readObject();
            System.out.println("이름: " + p2.getName());
            System.out.println("나이: " + p2.getAge());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (input != null) {
                    input.close();
                }

            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }

}
