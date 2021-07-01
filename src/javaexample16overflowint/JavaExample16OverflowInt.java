
package javaexample16overflowint;


public class JavaExample16OverflowInt {

    
    public static void main(String[] args) {
        
        try{
            int a=2147483647;
            int b=3;
            int c=a+b; // overflow situation not detected
            int d=76554;
            System.out.println("c: "+c);
            System.out.println();
            System.out.println("--------------------");
            
            // how to detect overflow situation manually
            while(true)
            {
                d=d*173;
                System.out.println(d);
                if(d<=0)
                    throw new ArithmeticException("Overflow sitaution");
            }
            
        }// end try
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
    }
    
}
