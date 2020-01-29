//ingit
//17 jan 2020
//finding greatest no. among three no.s
public class Greater
{
     public static void main(String args[])
      {
         int a,b,c;
         a=Integer.parseInt(args[0]); 
         b=Integer.parseInt(args[1]);
         c=Integer.parseInt(args[2]);
         
         if(a > b && a > c)
         { System.out.println("First no. is greater"); }

         else if(b > a && b > c)
         { System.out.println("Second no. is greater"); }

         else
         { System.out.println("Third no. is greater"); }

         
       }
}