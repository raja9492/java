class student
{
    int a,b,c;
    student(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        display();
    }
    void display()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    student()
    {
        this(10);
        System.out.println("this is default class constructor");

    }
    student(int x)
    {
        System.out.println(x);

    }

}  
class usethis                
{
    public static void main(String[] args) 
    {
        student s1=new student(10,20,30);
        student s2=new student();

          
    }
}
