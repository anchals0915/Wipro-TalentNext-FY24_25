
// Create a class Box that uses a parameterized constructor
// to initialize the dimensions pf a box.
// The dimensions of the Box are width, height, depth.
// The Class should have a method that can return the volume of 
// the box. Create an object of the Box class and test the 
// functionalities 

class Box {
    private int width;
    private int height;
    private int depth;

    // takes dimensions
    Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // method - returns voulme of the box
    float volume() {
        return width * height * depth;
    }
}

public class Solution1 {
    public static void main(String[] args) {

        Box b1 = new Box(1, 2, 3);
        System.out.println(b1.volume());

    }
}
