package co.uk.nathanfurman;

/**
 * @author : Nathan Furman
 * @since : 09/07/2020, Thu
 **/

public final class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void sort() {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if(array[i] > array[i + 1]) {
                    swap(array,i,i+1);
                }
            }
        }
        for(int val : array) {
            System.out.println(val);
        }
    }

    private void swap(int[] array, int currentPosition, int nextPosition) {
        if(currentPosition == nextPosition) {
            return;
        }
        int temp = array[currentPosition];
        array[currentPosition] = array[nextPosition];
        array[nextPosition] = temp;
    }
}
