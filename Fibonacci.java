//Write a program to print Fibonacci series using loop
//ingit
//17 jan 2020

public class Fibonacci
{
   public static void main(String args[])
    {
      int a,b,c,n;
     n=Integer.parseInt(args[0]);
     //initial elements of the series
      a=0;
      b=1;
     //printing first two no.s of series
       System.out.println(a);
       System.out.println(b);    
      for(int i=2;i<n;i++)
      {
        // every iteration has sum value of previous two no.s 
         c=a+b;
         System.out.println(c);
        // Swapping
         a=b;
         b=c;
      }
    }
}