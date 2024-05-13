package abstraction_packages_exception_handling.assignments.packages.solution1.Test;

public class Foundation {
    //private 
    private String var1 ;

    // protected 
    protected String var3 ; 
    
    //public 
    public String var4 ;
    
    // Default 
    String var2 ; 


    public static void main(String[] args) {
        Foundation f  = new Foundation() ;

        System.out.println( f.var1 ); // private variable
        System.out.println( f.var2 ); // default 
        System.out.println( f.var3 ); // protected 
        System.out.println( f.var4 ); // public 
    }  
}

// Same package 
    // same file 
    // differnet file 
    
    // different package 
    // same file 
    // differnet file 