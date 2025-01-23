public class Pratap {

    public boolean isEmpty() {
        String s = "";
        return s.isEmpty();
    }

    public int length() {
        String s = "pratap";
        System.out.println(s.length());
        return s.length();
    }

    public String replace(char old, char New) {
        String s = "Kalpesh";
        System.out.println(s.replace('K', 'M'));
        return s;
    }

    public String subString(int begin) {
        String s = "Kalpesh";
        return s.substring(3);
    }

    public String subString() {
        String s = "Kalpesh";
        return s.substring(3,5);
     }

    public static void main(String[] args) {
        // String s = new String("Pratap");
        // s.concat("Software");
        // System.out.println(s);
        // s = s.concat("solution");
        // System.out.println(s);

        // String s1 = new String("Spring");
        // s1.concat("Fall");
        // String s2 = s1.concat("Winter");
        // s2.concat("Summer");
        // System.out.println(s1);
        // System.out.println(s2);
        // String s = "Pratap";
        // System.out.println(s.length());
        // System.out.println(s.charAt(5));
        // System.out.println(s.charAt(9)); // StringIndexOutOfBoundsException

        String s2 = "Pratap 123  ";
        // System.out.println(s2.concat("Shinde"));
        // Pratap p = new Pratap();
        // System.out.println(s2.isEmpty());
        // System.out.println(s2.length());
        // System.out.println(s2.replace('K', 'M'));
        // System.out.println(s2.subString(3));
        // System.out.println(s2.subString(3,5));

        // System.out.println(s2.indexOf("a"));
        //    System.out.println(s2.trim());
    
        StringBuffer s = new StringBuffer("KAlpesh");
        StringBuilder s1 = new StringBuilder("KAlpesh");
        for (int i = 0; i < s.length()-1; i++) {
            System.out.println(s.charAt(i));
            System.out.println(s1.charAt(i));
            // System.out.println(s.capacity());
        }
    }
}
