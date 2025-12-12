public class Overloading {

//    polymorphism - Method Overloading/ Compile time polymorphism
    public static int sum(int a , int b)
    {
        System.out.println("twosum is working");
        return a+b;
    }

    public static int sum(int a, int b , int c)
    {
        System.out.println("Three sum is working");
        return a+b+c;
    }

    public static void main(String[] args) {

        int a=10, b=20,c=30;

        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
    }
}
