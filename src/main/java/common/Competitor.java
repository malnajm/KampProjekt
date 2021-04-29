package common;

import java.util.Scanner;

public class Competitor {

    String namn;
    int age;

    public Competitor(String namn, int age) {
        super();
        this.namn = namn;
        this.age = age;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*


    public String outPutName(String userInput) {

        String tillbaka = userInput;

        System.out.println(tillbaka);

        return tillbaka;

    }
 */

    }

