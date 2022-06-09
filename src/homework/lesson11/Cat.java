package homework.lesson11;

import java.util.Objects;

public class Cat {

    String name;
    int age;
    int weight;
    String breed;

    public Cat() {
        System.out.println("Cat has been created!");
    }

    public Cat(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public Cat(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + this.name + '\'' +
                ", age='" + this.age + '\'' +
                ", weight=" + this.weight +
                ", breed='" + this.breed + '\'' +
                '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            return this.age == cat.age && this.weight == cat.weight;
        }
        return false;
    }
}


