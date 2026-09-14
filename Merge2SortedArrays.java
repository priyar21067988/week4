public class Solution {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0; // pointer for arr1
        int j = 0; // pointer for arr2
        int k = 0; // pointer for result

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from arr1
        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        // Copy any remaining elements from arr2
        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1a = {1, 3, 5};
        int[] arr2a = {2, 4, 6};
        int[] merged1 = mergeSortedArrays(arr1a, arr2a);
        for (int val : merged1) {
            System.out.print(val + " ");
        }
        System.out.println(); // 1 2 3 4 5 6

        int[] arr1b = {};
        int[] arr2b = {1, 2, 3};
        int[] merged2 = mergeSortedArrays(arr1b, arr2b);
        for (int val : merged2) {
            System.out.print(val + " ");
        }
        System.out.println(); // 1 2 3
    }
}
