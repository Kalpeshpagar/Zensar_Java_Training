class Encapsulation1 {
    private int id;
    private String name;
    private String collegeName;

    // public Encapsulation1(int id, String name, String collegeName) {
    //     this.id = id;
    //     this.name = name;
    //     this.collegeName = collegeName;
    // }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Encapsulation1 e = new Encapsulation1();

        // Without Constructor

        e.setId(101);
        System.out.println("Student ID : " + e.getId());

        e.setName("Kalpesh");
        System.out.println("Name of Student : " + e.getName());

        e.setCollegeName("MET");
        System.out.println("College Name : " + e.getCollegeName());
    }
}
