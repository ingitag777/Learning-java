//program to implement a command line calculator.
//ingit
//17 jan2020

public class Calculator
{
   public static void main(String args[])
   {
     int a=Integer.parseInt(args[0]);
     int b=Integer.parseInt(args[2]);
     String op=args[1];
     // equals is for comparing strings 
     if(op.equals("+"))
     {
         System.out.println("Addition" + (a+b));
     }

     if(op.equals("-"))
     {
         System.out.println("Substraction" + (a-b));
     }
 
     if(op.equals("*"))
     {
         System.out.println("Product" + (a*b));
     }

     if(op.equals("/"))
     {
         System.out.println("Division" + (a/b));
     }
     
   }
}