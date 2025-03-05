package animals;

public class Animal2 {
    public static void main(String[] args) {
        Cat persan = new Cat("persan");

        Animal cat = new Animal(12, "Felix", persan);

        System.out.println("The cat's name is " + cat.name + " and it is " + cat.age + " years old. This is a " + persan);
    }
}

class Animal {
    int age;
    String name;
    Cat cat;

    public Animal( int age, String name, Cat cat) {
        this.age = age;
        this.name = name;
        this.cat = cat;
    }
}

class Cat {
    String race;

    public Cat(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "cat of race " + race;
    }
}
