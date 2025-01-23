import java.util.*;

interface Client {
    void input();

    void output();
}

class Kalpesh implements Client {
    String name;
    String pass;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee name : ");
         name = sc.nextLine();
        System.out.println("enter employee password : ");
        pass = sc.nextLine();

        sc.close();
    }

    public void output() {

        System.out.println("employee name : " + name);

        System.out.println("employee password : " + pass);

    }
}

public class Interface {
    public static void main(String[] args) {
       Kalpesh c = new Kalpesh();
        c.input();
        c.output();
    }
}
