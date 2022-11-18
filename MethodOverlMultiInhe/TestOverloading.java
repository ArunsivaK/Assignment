package MethodOverlMultiInhe;
public class TestOverloading
{
    static int add(int a,int b)
    {
        return a + b;
    }
        static double sub(double a,double b,double c) {
        return a-b-c;}
        static float multi(float a,float b){
        return a*b;}
        static long div(long a,long b){
        return a/b;}

    public static void main(String[] args) {
        System.out.println(TestOverloading.add(12,443));
        System.out.println( TestOverloading.sub(12,43,25));
        System.out.println( TestOverloading.multi(4,5));
        System.out.println( TestOverloading.div(10,5));
    }
    }

