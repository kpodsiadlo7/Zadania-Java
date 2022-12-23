/**
 * INSTRUCTION
 * Your task is to write a function that takes a string and return a new string with all vowels removed.
 * EXAMPLE
 * For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
 */

public class DisemvowelTrolls {
    public static void main(String[] args) {
        System.out.println("Returning string: " +disemvowel("This website is for losers LOL!")
                            +"\nMust be: \"Ths wbst s fr lsrs LL!\"");
        System.out.println(smartDisemvowel("This website is for losers LOL!"));
    }

    static boolean filter(char a){
        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' ||
                a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U';
    }

    public static String disemvowel(String str) {
        StringBuilder troll = new StringBuilder();
        for (int i=0; i<str.length(); i++){
            if (!filter(str.charAt(i))){
                troll.append(str.charAt(i));
            }
        } return troll.toString();
    }

    public static String smartDisemvowel(String str) {
        return str.replaceAll("[aAeEiIoOuU]", "");
    }
}
