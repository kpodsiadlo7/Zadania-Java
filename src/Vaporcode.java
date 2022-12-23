
/**
 * "Lets go to the movies"       -->  "L  E  T  S  G  O  T  O  T  H  E  M  O  V  I  E  S"
 * "Why isn't my code working?"  -->  "W  H  Y  I  S  N  '  T  M  Y  C  O  D  E  W  O  R  K  I  N  G  ?"
 */

public class Vaporcode {
    public static void main(String[] args) {
        System.out.println("Returning string: " +vaporcode("Lets go to the movies")
                +"\nCorrect string: \"L  E  T  S  G  O  T  O  T  H  E  M  O  V  I  E  S\"");
    }

    public static String vaporcode(String s) {
        return s.toUpperCase().replaceAll(" ","").replaceAll("", "  ").stripLeading().stripTrailing();
        //return String.join("  ", s.replaceAll(" ", "").toUpperCase().split(""));
    }
}
