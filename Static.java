public class Static {

    int id;
    String name;
    static String collName = "MET";

    Static(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("College name : "+collName);
    }
    public static void main(String[] args) {
        Static s = new Static(101, "Kalpesh");
        s.display();
        
    }
    
}
