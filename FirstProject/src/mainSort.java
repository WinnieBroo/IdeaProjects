/**
 * Created by Maxim on 30.12.2016.
 */
import java.util.*;

public class mainSort {

    // Printing array elements
    // (?1) Вот тут он потребовал сделать метод статическим, потому что я его использую в статическом контектсе
    public static void printArrayElem(int[] arr) {
        for (int arrelem : arr) {
            System.out.print(arrelem);
            System.out.print(", ");
        }
    }

    public static void main(String[] args){

        // Initialization of array
        getArray newArray = new getArray();
        int[] fkingTestArray = newArray.getArrWithRandValues(20);
        printArrayElem(fkingTestArray);

        // Sorting array fkingTestArray through famous methods of sorting
        bubbleSort bubble = new bubbleSort();
        int[] arrSortedValues = bubble.bubSort(fkingTestArray);
        printArrayElem(arrSortedValues);
    }


}