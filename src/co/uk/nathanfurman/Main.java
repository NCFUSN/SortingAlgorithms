package co.uk.nathanfurman;

public class Main {

    public static void main(String[] args) {

        int[] arr = {12, -56, 12, 89, -45};

	    // Bubble sort
/*
        BubbleSort bubbleSort = new BubbleSort(arr);
        bubbleSort.sort();

        // Selection sort
        SelectionSort selectionSort = new SelectionSort(arr);
        selectionSort.sort();
        */

        // Insertion sort
        InsertionSort insertionSort = new InsertionSort(arr);
        insertionSort.sort();
    }
}
