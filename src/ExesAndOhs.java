public class ExesAndOhs {
    public static void main(String[] args) {

        System.out.println("Should be true: " +getXO("xxxooo"));
        System.out.println("Should be false: " +smartGetXO("xxx23424esdsfvxXXOOooo"));

    }
    public static boolean getXO (String str) {
        int x = 0;
        int o = 0;

        for (int i =0; i<str.length(); i++){
            if (str.charAt(i) == 'x' || str.charAt(i) == 'X')
                x++;

            if (str.charAt(i) == 'o' || str.charAt(i) == 'O')
                o++;
        }
        return x == o;
    }

    public static boolean smartGetXO (String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();
    }
}
