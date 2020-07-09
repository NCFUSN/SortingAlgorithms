package co.uk.nathanfurman;

public class InsertionSort {
    private int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void sort() {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
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
