1class Solution {
2
3    public void sortColors(int[] nums) {
4
5        int low = 0;
6        int mid = 0;
7        int high = nums.length - 1;
8
9        while (mid <= high) {
10
11            if (nums[mid] == 0) {
12
13                swap(nums, low, mid);
14
15                low++;
16                mid++;
17            }
18
19            else if (nums[mid] == 1) {
20                mid++;
21            }
22
23            else {
24
25                swap(nums, mid, high);
26
27                high--;
28            }
29        }
30    }
31
32    private void swap(int[] nums, int i, int j) {
33
34        int temp = nums[i];
35        nums[i] = nums[j];
36        nums[j] = temp;
37    }
38}