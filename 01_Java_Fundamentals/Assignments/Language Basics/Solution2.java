
/*
 * Q.2) Write a program to accept a string as a command line arugment and print a welcome message as given below
 * java Sample John 
 * Output: Welcome John
 */
class Solution2 {
    public static void main(String[] args) {
        if (args.length != 0) {
            System.out.println("Please enter atleast one argument.");
            return;
        }

        System.out.println("Welcome " + args[0]);
    }
}
