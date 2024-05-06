
class Animal {
    void eat() {
        System.out.println("Animal is eating!!!");
    }

    void sleep() {
        System.out.println("Animal is sleeping!!!");
    }
}

class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Bird is eating!!!");
    }

    @Override
    void sleep() {
        System.out.println("Bird is sleeping!!!");
    }

    void fly() {
        System.out.println("Bird is flying!!!");
    }
}

class Solution1 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat();
        a1.sleep();

        Bird b1 = new Bird();
        b1.eat();
        b1.sleep();
        b1.fly();

    }
}
