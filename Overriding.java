public class Overriding {

    public static void hello ()
    {
        System.out.println("Hello from class Overriding");
    }

    public static void main(String[] args) {

//        Overriding o = new Overriding();
                hello();
//        Animal a = new Animal();
//        a.hello();
//        Human h = new Human();
//        h.hello();
    }
}

class Animal{
    public void hello()
    {
        System.out.println("Hello from Animal Class");
    }

}

class Human
{
    public void hello()
    {
        System.out.println("Hello from Human Class");
    }
}
