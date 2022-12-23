public class RgbToHex {
    public static void main(String[] args) {
        System.out.println("Returning hex: " +rgb(125,255,33)
                            +"\nCorrect value: 7DFF21");
        System.out.println("Smart hex:     " +smartRgb(125,255,33));
    }

    public static String rgb(int r, int g, int b) {
        return rgbToHex(r) + rgbToHex(g) + rgbToHex(b);
    }

    public static String rgbToHex(int r) {
        if (r < 0)
            return "00";
        if (r > 255)
            return "FF";
        int val = 0;
        int temp = 0;
        String a = "";
        String b = "";
        for (int i=0; i<=r; i++){
            if (i>temp+15){
                temp = i;
                val++;
            }
        }

        if (val == 10) a = "A";
        if (val == 11) a = "B";
        if (val == 12) a = "C";
        if (val == 13) a = "D";
        if (val == 14) a = "E";
        if (val >= 15) a = "F";

        if (r%16 == 10) b = "A";
        if (r%16 == 11) b = "B";
        if (r%16 == 12) b = "C";
        if (r%16 == 13) b = "D";
        if (r%16 == 14) b = "E";
        if (r%16 == 15) b = "F";

        if (val >= 10 && r%16 >= 10) return a + b;

        if (r%16 >= 10) return String.format("%d%s",val,b);
        if (val >= 10) return String.format("%s%d",a,r%16);
        return String.format("%d%d", val,r%16);
    }

    public static String smartRgb(int r, int g, int b) {
        if(r < 0) r = 0;
        if(g < 0) g = 0;
        if(b < 0) b = 0;
        if(r > 255) r = 255;
        if(g > 255) g = 255;
        if(b > 255) b = 255;

        return String.format("%02X%02X%02X", r, g, b);
    }
}
