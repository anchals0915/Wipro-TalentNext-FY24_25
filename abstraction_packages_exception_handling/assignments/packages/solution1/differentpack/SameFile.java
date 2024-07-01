package abstraction_packages_exception_handling.assignments.packages.solution1.differentpack;

import abstraction_packages_exception_handling.assignments.packages.solution1.Test.Foundation;

public class SameFile {
        public static void main(String[] args) {
        Foundation f  = new Foundation() ;

        // System.out.println( f.var1 );// private variable : The field Foundation.var1 is not visible 
        // System.out.println( f.var2 );// default  : The field Foundation.var2 is not visible 
        // System.out.println( f.var3 );// protected  : The field Foundation.var3 is not visible 
        System.out.println( f.var4 );
    }      
}
