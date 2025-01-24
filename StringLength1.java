import java.util.Optional;

public class StringLength1 {
    public static Optional<String> getName() {
        String s = null;
        return Optional.ofNullable(s);
        
    }

    public static void main(String[] args) {
        String s1 = "Kalpesh";
        // if (s1 == null) {
        //     System.out.println("String is null");
        // } else {
        //     System.out.println("String is not null & length : " + s1.length());
        // }
        Optional<String> opt = Optional.ofNullable(s1);
        System.out.println(opt.isEmpty());
        System.out.println(opt.isPresent());
        System.out.println(opt.orElse("null value"));

        Optional<String> opt1 = getName();
        System.out.println(opt1.isEmpty());
        System.out.println(opt1.orElse("null value"));
    }
    // to check the string is null or not multiple times  using if else instead we can use Optional class.
    // Optional is a container object which may or may not contain a non-null value.
    // orElse() method returns the value if present, otherwise returns other.
    // ofNullable() method returns an Optional describing the specified value, if non-null, otherwise returns an empty Optional.
}
