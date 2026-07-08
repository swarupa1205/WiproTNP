package InheritanceOverridingPolymorphism;

class Fruit {
    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Taste: " + taste);
    }
}

class Apple extends Fruit {

    Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    void eat() {
        System.out.println("Apple tastes " + taste);
    }
}

class Orange extends Fruit {

    Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    void eat() {
        System.out.println("Orange tastes " + taste);
    }
}

public class FruitDemo {
    public static void main(String[] args) {
        Apple a = new Apple();
        Orange o = new Orange();

        a.eat();
        o.eat();
    }
}