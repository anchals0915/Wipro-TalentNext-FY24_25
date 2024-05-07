

// Question 2
/*
 * Create a base class Shape with methods draw() and erase()
 * Inherit the same in 3 other classes Circle, Triangle, and Square 
 * and override draw() and erase() methods to represent each shape.
 */

 class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
    void erase() {
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
    @Override
    void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }
    @Override
    void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
    @Override
    void erase() {
        System.out.println("Erasing Square");
    }
}

public class Solution2 {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        c.draw();
        c.erase();
        
        t.draw();
        t.erase();

        s.draw();
        s.erase();
    }
}
