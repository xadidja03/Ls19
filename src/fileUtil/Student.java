package fileUtil;
import java.io.Serializable;

public class Student implements Serializable {
    private int age;
    private String name;
    private String surName;
    public  Student(){

    }

    public Student(int age, String name, String surName) {
        this.age = age;
        this.name = name;
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
