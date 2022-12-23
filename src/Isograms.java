/** INSTRUCTION EXAMPLE
 * "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)
 */

public class Isograms {
    public static void main(String[] args) {
        System.out.println("Returning value: " +isIsogram("Dermatoglyphics")
                +"\nMust be true");
    }

    public static boolean  isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
