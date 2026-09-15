package Poo.PooClasses;

public class Person {

    private String name;

    private int age;

    public String getName(){
        return name;
    };

    public Person setName(String name){
        this.name = name;
        return this;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;

    }

}
