public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] minMax = getMinMax(arr);

        System.out.println("Min: " + minMax[0]);
        System.out.println("Max: " + minMax[1]);
    }

    // Returns an array of size 2, where the first element is the minimum value
    // and the second element is the maximum value.
    // The array is assumed to be non-empty.
    // The array is assumed to contain only positive integers.
    // The array is assumed to be unsorted.
    // The array is assumed to be non-null.
    // The array is assumed to contain at least 2 elements.
    // The array is assumed to contain no duplicate elements.
    public static int[] getMinMax(int[] arr) {
        int[] minMax = new int[2];
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        minMax[0] = min;
        minMax[1] = max;

        return minMax;
    }
}
