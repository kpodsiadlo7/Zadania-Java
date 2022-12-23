/** INSTRUCTION EXAMPLE
 * "camelCasing"  =>  "camel Casing"
 * "identifier"   =>  "identifier"
 * ""             =>  ""
 */

public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println("Returning string: " +camelCase("camelCasing")
                +"\nCorrect String: \"camel Casing\"");
        System.out.println("Smart camelCase: " +smartCamelCase("camelCasing"));
    }

    public static String camelCase(String input) {
        String output = "";
        for(int i=0; i<input.length(); i++){
            if (input.charAt(i) <= 'Z') {
                output += " ";
            }
            output += input.charAt(i);
        }return output.toString();
    }

    public static String smartCamelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
