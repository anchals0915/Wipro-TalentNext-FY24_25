// Question 1
/*
 * Create a base class Fruit with name, taste and size as its attributes 
 * Create a method called eat() which describes the name of the fruit 
 * and its taste 
 * Inherit the same in 2 other classes Apple and Orange and override that eat()
 * method to represent each fruit taste.
 */

 class Fruit {
    String name;
    String taste;
    String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("Eating " + name + " which tastes " + taste);
    }
}

// Subclass Apple
class Apple extends Fruit {
    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Eating " + name + " which tastes sweet");
    }
}

// Subclass Orange
class Orange extends Fruit {
    public Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Eating " + name + " which tastes tangy");
    }
}

public class Solution1 {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Generic Fruit", "Unknown", "Medium");
        fruit1.eat(); 
        
        Fruit a1 = new Apple("Apple", "Sweet", "Medium");
        a1.eat();

        Fruit o1 = new Orange("Orange", "Tangy", "Medium");
        o1.eat();
    }
}