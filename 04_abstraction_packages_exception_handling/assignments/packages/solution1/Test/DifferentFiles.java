package abstraction_packages_exception_handling.assignments.packages.solution1.Test;


public class DifferentFiles {
    public static void main(String[] args) {
        Foundation f  = new Foundation() ;

        // System.out.println( f.var1 ); private variable
        System.out.println( f.var2 ); // default 
        System.out.println( f.var3 ); // protected 
        System.out.println( f.var4 ); // public 
    }    
}
