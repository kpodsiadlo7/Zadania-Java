/** INSTRUCTION EXAMPLE
 * At the end of the first year there will be:
 * 1000 + 1000 * 0.02 + 50 => 1070 inhabitants

 * At the end of the 2nd year there will be:
 * 1070 + 1070 * 0.02 + 50 => 1141 inhabitants (** number of inhabitants is an integer **)

 * At the end of the 3rd year there will be:
 * 1141 + 1141 * 0.02 + 50 => 1213

 * It will need 3 entire years.
 */


public class GrowthOfAPopulation {
    public static void main(String[] args) {
        System.out.println("Returning year: " +nbYear(1500, 5, 100, 5000) +"\nCorrect year: 15");
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        int year = 0;
        while(p0<p){
            p0 += p0*(percent/100) + aug;
            year++;
        }
        return year;
    }
}
