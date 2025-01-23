class CheckUpLw {
    // public static void check_U_L(String str) {
    // StringBuffer toUpper = new StringBuffer();
    // StringBuffer toLower = new StringBuffer();

    // for (char ch : str.toCharArray()) {
    // if (Character.isUpperCase(ch)) {
    // toUpper.append(ch);
    // } else {
    // toLower.append(ch);
    // }
    // }
    // System.out.println("To upperCase : " + toUpper);
    // System.out.println("To lowerCase : " + toLower);
    // }

    public static void check(String str) {
        int toLower = 0;
        int toUpper = 0;
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                s1 += str.charAt(i);
                toUpper++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                s2 += str.charAt(i);
                toLower++;
            } else {
                System.out.println("No upperCase and lowerCase character");
            }

        }
        System.out.println("To UpperCase CHAR : "+s1+" ");
        System.out.println("UpperCase Count : " + toUpper);
        System.out.println("To UpperCase CHAR : "+s2+" ");
        System.out.println("LowerCase Count : " + toLower);
    }

    public static void main(String[] args) {
        String str = "KalPesh";
        // check_U_L(str);
        check(str);
    }
}