import java.util.*;
class  usestatic
{
    static  int a=3;
    static  int b;
    static void  fun(int x)
    {
        System.out.println("x=" +x);
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    static 
    {
        System.out.print("static block initialized");
        b=a*4;
    }   
    public static void main(String[] args)
    {
        fun(42);    
    }
}
