package com.guangze.sort;


public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 1, 1, 2, 0, 0};
        QuickSort quickSort = new QuickSort();
        int[] ans = quickSort.sortArray(nums);

        for (int num : ans) {
            System.out.print(num+" ");
        }
    }


    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int mid = partition(nums, left, right);
        quickSort(nums,left,mid-1);
        quickSort(nums,mid+1,right);
    }

    private int partition(int[] nums, int i, int j) {
        int pivot = nums[i];
        int left = i;
        int right = j;
        while (left < right) {
            while(left < right && nums[right] >= pivot) right--;
            while(left < right && nums[left] <= pivot) left++;
            if(left != right){
                swap(nums,left,right);
            }
        }
        swap(nums,i,left);
        return left;
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
