import java.util.Arrays;

public class FindIntersection {
    public static void main(String[] args) {
        System.out.println(findIntersection(new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}));

    }
    public static String findIntersection(String[] strArr) {
        String first = strArr[0];
        String second = strArr[1];
        String[] firstArr = first.split(", ");
        String[] secondArr = second.split(", ");
        StringBuilder result = new StringBuilder();

        for (String k: firstArr){
            for (String l: secondArr){
                if (k.equals(l)){
                    result.append(k).append(", ");
                }
            }
        }
        result.replace(result.length()-2, result.length(), "");
        strArr[0] = String.valueOf(result);
        return strArr[0];
    }
}
