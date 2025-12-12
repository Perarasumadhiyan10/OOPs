import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stmanag st = new Stmanag(1,"Perarasu","CSE",3);
        ArrayList<Stmanag> list = new ArrayList<>();
        list.add(st);
//        System.out.println(st.add()
//       System.out.println(st+" "+list.get(0).id);
        System.out.println(st.add());
        System.out.println(st.toString());
    }
}
