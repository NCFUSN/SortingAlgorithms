package co.uk.nathanfurman;

public class SelectionSort {
    private int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void sort() {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++) {
                if(array[i] > array[largest]) {
                    largest = i;
                }
            }
            swap(array, largest, lastUnsortedIndex);
        }
        for(int val : array) {
            System.out.println(val);
        }
    }

    private void swap(int[] array, int largest, int nextPosition) {
        if(largest == nextPosition) {
            return;
        }
        int temp = array[largest];
        array[largest] = array[nextPosition];
        array[nextPosition] = temp;
    }
}
