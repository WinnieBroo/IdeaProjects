import java.util.*;

public class getArray {

    // Fill array with the random values between -25 and 25
    public int[] getArrWithRandValues(int countValues) {
        Random random = new Random(System.currentTimeMillis());
        int[] arrRandValues = new int[countValues];
        for (int i = 0; i < countValues; i++) {
            int q = random.nextInt(51) - 25;
            arrRandValues[i] = q;
        }
        return arrRandValues;
    }
}
