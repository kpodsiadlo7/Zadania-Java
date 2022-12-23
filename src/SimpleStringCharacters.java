/**
 * word.replaceAll("[\\w]", "").length() < chyba zmienia wszystkie znaki specjalne
 */


import java.util.Arrays;

public class SimpleStringCharacters {
    public static void main(String[] args) {
        System.out.println("Returning value: " +Arrays.toString(solve("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft"))
                            +"\nMust be:         [7,13,4,10]");
        System.out.println("Smart value:     " +Arrays.toString(smartSolve("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft"))
                +"\nMust be:         [7,13,4,10]");
    }

    public static int[] solve(String s){
        int big = s.length() - s.replaceAll("[A-Z]","").length();
        int small = s.length() - s.replaceAll("[a-z]", "").length();
        int num = s.length() - s.replaceAll("[0-9]","").length();
        int special = s.length() - big - small - num;
        return new int[]{big,small,num,special};
    }

    public static int[] smartSolve(String s){
        return new int[]{
                s.replaceAll("[^A-Z]","").length(), // '^' ten dziubek wskazuje na ilość zamienionych rzeczy
                s.replaceAll("[^a-z]","").length(),
                s.replaceAll("[^0-9]","").length(),
                s.replaceAll("[\\w]","").length()
        };
    }
}
