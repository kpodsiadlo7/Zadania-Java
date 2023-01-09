import java.util.HashMap;
import java.util.Map;

public class GreedIsGood {
    public static void main(String[] args) {
        System.out.println(greedy(new int[]{6,6,6,6,1}));
    }
    public static int greedy(int[] dice){
        Map<Integer,Integer> diceAmount = new HashMap<>();
        int score = 0;

        for(int i: dice){
            diceAmount.putIfAbsent(i, 0);
            diceAmount.put(i,diceAmount.get(i)+1);
        }
        for(Map.Entry<Integer,Integer> m: diceAmount.entrySet()){
            if(m.getValue() >= 3){
                switch (m.getKey()) {
                    case 1 -> {
                        score += 1000;
                        diceAmount.put(m.getKey(), m.getValue()-3);
                    }
                    case 2 -> {
                        score += 200;
                        diceAmount.put(m.getKey(), m.getValue()-3);
                    }
                    case 3 -> {
                        score += 300;
                        diceAmount.put(m.getKey(), m.getValue()-3);
                    }
                    case 4 -> {
                        score += 400;
                        diceAmount.put(m.getKey(), m.getValue()-3);
                    }
                    case 5 -> {
                        score += 500;
                        diceAmount.put(m.getKey(), m.getValue()-3);
                    }
                    case 6 -> {
                        score += 600;
                        diceAmount.put(m.getKey(), m.getValue()-3);
                    }
                }
            }

                switch (m.getKey()){
                    case 1 -> score += 100 * m.getValue();
                    case 5 -> score += 50 * m.getValue();
                }

        }
        return score;
    }
}
