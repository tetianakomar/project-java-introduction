package homework.lesson11;

public class CatMain {
    public static void main(String[] args) {

        Cat cat = new Cat();

        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.weight);
        System.out.println(cat.breed);

        Cat cat1 = new Cat();
        cat1.name = "Tom";
        cat1.age = 3;
        cat1.weight = 3;
        cat1.breed = "Britain";

        System.out.println(cat1.name);
        System.out.println(cat1.age);
        System.out.println(cat1.weight);
        System.out.println(cat1.breed);

        Cat cat2 = new Cat(5, 2);
        cat2.name = "Mika";
        cat2.age = 2;

        System.out.println(cat2.name);
        System.out.println(cat2.age);

        Cat cat3 = new Cat("Jerry", 4, 4, "Egypt");
        System.out.println(cat3);

        System.out.println(cat == cat1);
        System.out.println(cat.equals(cat1));

    }
}


