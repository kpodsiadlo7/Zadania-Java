/**
 * Given a string str, reverse it and omit all non-alphabetic characters.
 *
 * Example
 * For str = "krishan", the output should be "nahsirk".
 *
 * For str = "ultr53o?n", the output should be "nortlu".
 *
 * Input/Output
 * [input] string str
 * A string consists of lowercase latin letters, digits and symbols.
 *
 * [output] a string
 */

public class ReverseLetter {
    public static void main(String[] args) {
        System.out.println("should return \"nahsirk\":\t" +reverseLetter("krishan"));
        System.out.println("should return \"nahsirk\":\t" +smartReverseLetter("krishan"));
    }

    public static String reverseLetter(final String str) {
        String s = str.replaceAll("[0-9\\W_]", "");
        char[] arr = s.toCharArray();
        StringBuilder result = new StringBuilder();

        for(int i=arr.length-1; i>=0 ; i--){
            result.append(arr[i]);
        }
        return result.toString();
    }

    public static String smartReverseLetter(final String s) {
        return new StringBuilder(s.replaceAll("[^a-zA-Z]", "")).reverse().toString();
    }
}
