public class Exceptionhanding {

    public static int div(int a, int b)
    {
        try{
            return  a/b;
        }
        catch(Exception e)
        {
            System.out.println("error"+e.getMessage());
        }
        finally {
            System.out.println("Oper");
        }
        return 0;
    }
    public static void main(String[] args) {

        int a =9,b=6;

        System.out.println(div(a,b));
    }
}
