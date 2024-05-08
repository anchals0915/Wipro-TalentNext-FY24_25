import java.util.Scanner;

public class Solution8 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a String : ");
        String str = sc.next().trim() ;

        String result = fun(str) ; 
        System.out.println("Result : " + result);
        sc.close();
    }
    public static String fun(String str)
    {
        while( str.contains("*")) 
        {
            int index = str.indexOf("*") ; 
            str = str.substring(0,index-1)+ str.substring(index+2, str.length()); 
        }
        return str ;
    }
}
