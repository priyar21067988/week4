public class Solution {

    public static int[] rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            newArray[(i + k) % n] = nums[i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int[] result1 = rotateArray(nums1, 3);
        for (int val : result1) {
            System.out.print(val + " ");
        }
        System.out.println(); // 5 6 7 1 2 3 4

        int[] nums2 = {1, 2};
        int[] result2 = rotateArray(nums2, 3);
        for (int val : result2) {
            System.out.print(val + " ");
        }
        System.out.println(); // 2 1
    }
}
