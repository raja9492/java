class variablearg
{
    static void fun(int...a)
    {
        System.out.println("number of arguments"+a.length);
        for(int i:a)
            System.out.println(i+"");
        System.out.println();
    }
    static  void fun(int a,int b ,int c ,int d)
    {
        System.out.println("");
    }

    public static void main (String[] args)
    {
        fun(100);
        fun(1,2,3,4);
        fun();
    }
}
