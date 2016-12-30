public class bubbleSort {

    public int[] bubSort(int[] arr){
        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length; j++) {
                if (arr[j]<arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }

}
