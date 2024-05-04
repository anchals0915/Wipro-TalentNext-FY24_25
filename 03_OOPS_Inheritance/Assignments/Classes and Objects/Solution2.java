
// Create a new class called Calculator with the following 
// methods:
// 1. A static method called powerInt( int num1 , int num2) 
// This method should return num1 to the power num2 .
// 2. A static method method powerDouble(double num1 , int num2 )
// Solution 

class Calculator {
    static double powerInt(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

public class Solution2 {
    public static void main(String[] args) {
        System.out.println(Calculator.powerDouble(1.23, 2));
        System.out.println(Calculator.powerInt(1, 2));
    }
}
