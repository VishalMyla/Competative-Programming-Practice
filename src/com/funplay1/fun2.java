package com.funplay1;

public class fun2 {
    public static void main(String[] args) {
        int[] arr = {7,8,9,10,11,12,1,2,3,4,5,6};
        int target = 10;
        System.out.println(find_pivit(arr));
        System.out.println(search(arr,target));

    }
    static int search(int[] nums, int target) {
        int pivot = find_pivit(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
    static int  find_pivit(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < end && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] > start && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (start >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }


    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
