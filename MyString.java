public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) < 97) {
                newstr += (char) (str.charAt(i) + 32);
            }
            else {
                newstr += str.charAt(i);
            }
        }
        return newstr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        int n = 0;
        for (int i=0; i < str2.length(); i++) {
            if ( i == 0 ) { // check if exist first char
            for (int m = 0; m < str1.length(); m++) {
                if (str2.charAt(i) == str1.charAt(m)) {
                    n = m;
                    break;                   
                }
                else if (m == str1.length() - 1) return false;
            }
        }
    }


        for(int i=0; i<str2.length(); i++) {
            if (str2.charAt(i) != str1.charAt(n)) return false;
            n++;
        }
        return true;
    }
}
