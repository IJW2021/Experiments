import java.util.ArrayList;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long endTime;
        String characters = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<Character> bsort_source = new ArrayList<>();
        int swap=0;
        char placeholder;

        for (int x = 0; x <= 80000; x++) {
            Random rnd = new Random();
            bsort_source.add(characters.charAt(rnd.nextInt(characters.length())));
        }


        for (int i = 0; i < bsort_source.size(); i++) {
            for (int j = 1; j < (bsort_source.size() - i); j++) {
                if (bsort_source.get(j - 1) > bsort_source.get(j))
                {
                placeholder=bsort_source.get(j - 1);
                bsort_source.set(j - 1, bsort_source.get(j));
                bsort_source.set(j,placeholder);
                swap=swap+1;
                }
            }
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number of Swaps="+swap);
        System.out.println("Time Taken="+Math.round(endTime - startTime)/1000.00);
    }
}
