/** A library of operations on arrays of characters (char values).
 *  The library also features a string comparison method. */
public class ArrCharOps {
    public static void main(String[] args) {
        String str = "clearly";
        char[] arr1 = {'c','l','e','a','r','l','y'};
        char[] arr2 = {'U','n','d','e','r','s','t', 'o', 'o', 'd'};
        System.out.println(str);  // Prints the string
        println(arr1);            // Prints an array of characters
        System.out.println(charAt(arr1,2));      
        System.out.println(indexOf(arr1,'l'));  
        System.out.println(indexOf(arr1,'l',3)); 
        System.out.println(lastIndexOf(arr1, 'l'));
        System.out.println(concat(arr1, arr2));
        System.out.println(subArray(arr2, 2, 9));
        System.out.println(compareTo("abcd", "abcd"));
        System.out.println(compareTo("abc", "abcd"));
        System.out.println(compareTo("abw", "abcd"));
        System.out.println(compareTo("Abcd", "a"));
        System.out.println(compareTo("apple", "banana"));
        System.out.println(compareTo("apple", "applepie"));
        System.out.println(compareTo("Zoo", "zoo"));
        System.out.println(hashCode(arr1));
        System.out.println(hashCode(arr2));
    }

    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static char charAt(char[] arr, int index) {
        char n = arr[index];
        return n;
    }

    public static boolean equals(char[] arr1, char[] arr2) {
        int i = 0;
        while (i < arr1.length) {
            if (arr1[i] != arr2[i]) return false;
            i++;
        }
        return true;
    }

    public static int indexOf(char[] arr, char ch) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == ch) return i;
            i++; 
        }
        return -1;
    }

    public static int indexOf(char[] arr, char ch, int fromIndex) {
        int i = fromIndex;
        while (i < arr.length) {
            if (arr[i] == ch) return i;
            i++; 
        }
        return -1;
    }

    public static int lastIndexOf(char[] arr, char ch) {
        int i = arr.length-1;
        while (i >= 0) {
            if (arr[i] == ch) return i;
            i--; 
        }
        return -1;
        
    }

    public static char[] concat(char[] arr1, char[] arr2) {
        char[] newarr = new char[arr1.length + arr2.length];
        int i = 0;
        int m = 0;
        while (i < (arr1.length)) {
            newarr[i] = arr1[i];
            i++;
        }
        while (m < (arr2.length)) {
            newarr[i] = arr2[m];
            i++;
            m++;
        }

        return newarr;
    }
    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        char[] newarr = new char[endIndex - beginIndex];
        int i = 0;
        int m = beginIndex;
        while (i < newarr.length) {
            newarr[i] = arr[m];
            i++;
            m++;
        }
        return newarr;
    }

    public static long hashCode(char[] arr) {
        long hash = 0;
        int m = arr.length;
        if (arr == null || arr.length == 0) return hash;
        for (int i =0; i<arr.length; i++) {
            int numchar = (int) arr[i];
            hash += numchar * (Math.pow(7, m-1));
            m--;
        }

        return hash;
    }

    public static int compareTo(String str1, String str2) {
        if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) return -2; 
        int minLength = Math.min(str1.length(), str2.length()); 
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if ((int) str1.charAt(i) < (int) str2.charAt(i)) return -1;
                else return 1;
            }
        }
        if (str1.length() == str2.length()) {
            return 0; // שוות
        }
        if (str1.length() < str2.length()) return -1;
        else return 1;
    }
}
