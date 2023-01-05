/**
 * Write function heron which calculates the area of a triangle with sides a, b, and c (x, y, z in COBOL).
 *
 * Heron's formula:
 *
 * s∗(s−a)∗(s−b)∗(s−c)\sqrt{s * (s - a) * (s - b) * (s - c)}
 * s∗(s−a)∗(s−b)∗(s−c)
 * ​
 *
 * where
 *
 * s=a+b+c2s = \frac{a + b + c} 2s=
 * 2
 * a+b+c
 * ​
 *
 * Output should have 2 digits precision.
 */

public class HeronFormula {
    public static void main(String[] args) {
        System.out.println("should be return 6.0 : " +heron(3,4,5));
    }

    static double heron(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
