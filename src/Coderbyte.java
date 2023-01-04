public class Coderbyte {
    public static void main(String[] args) {
        System.out.print(codelandUsernameValidation("123abc444"));
        System.out.print(smartCodelandUsernameValidation("123abc444"));
    }

    public static String codelandUsernameValidation(String str) {
        if (str.length() < 4 || str.length() > 25)
            return "false";
        char firstLetter = str.charAt(0);
        if (firstLetter < 65 || firstLetter >= 91 && firstLetter <= 96 || firstLetter >= 123)
            return "false";
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) <= 47 || str.charAt(i) >= 58 && str.charAt(i) <= 64 || str.charAt(i) >= 91 && str.charAt(i) <= 94 || str.charAt(i) == 96 || str.charAt(i) >= 123){
                    return "false";
            }
            if (str.charAt(str.length()-1) == 95)
                return "false";
        }
        return "true";
    }

    public static String smartCodelandUsernameValidation(String str) {
        if (str.length() < 5 || str.length() > 25)
            return "false";
        if (!Character.isLetter(str.charAt(0)))
            return "false";
        if (str.replaceAll("\\W","").length() != str.length())
            return "false";
        if (str.charAt(str.length()-1) == '_')
            return "false";

        return "true";
    }
}
