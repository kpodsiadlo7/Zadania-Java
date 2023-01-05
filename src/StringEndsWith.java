/**
 * Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
 *
 * Examples:
 *
 * solution('abc', 'bc') // returns true
 * solution('abc', 'd') // returns false
 */

public class StringEndsWith {
    public static void main(String[] args) {
        System.out.println("First solution method should return true: \t" +solution("samurai","ai"));
        System.out.println("Second solution method should return true: \t" +smartSolution("samurai","ai"));
    }

    public static boolean solution(String str, String ending) {
        if(ending.length() > str.length())
            return false;
        String sub = str.substring(str.length()-ending.length());
        return sub.equals(ending);
    }

    public static boolean smartSolution(String str, String ending) {
        return str.endsWith(ending);
    }
}
