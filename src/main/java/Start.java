import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        int e[] = {89, 2, 5, 9, 14, 42, 12, 43, 23, 40};
        int min = min(e);
        int max = max(e);
        System.out.println("Max value = " + max + " Min value = " + min);

    }

    private static int min(int[] e) {
        int min = e[0];
        for (int anE : e) {
            if (anE < min)
                min = anE;
        }
        return min;
    }

    private static int max(int[] e) {
        int max = e[0];
        for (int anE : e) {
            if (max < anE) max = anE;
        }
        return max;
    }
}
