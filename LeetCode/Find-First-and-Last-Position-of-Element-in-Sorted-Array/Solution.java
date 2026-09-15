1class Solution {
2
3    public int[] searchRange(int[] nums, int target) {
4
5        return new int[] {
6            first(nums, target),
7            last(nums, target)
8        };
9    }
10
11    private int first(int[] nums, int target) {
12
13        int left = 0;
14        int right = nums.length - 1;
15        int ans = -1;
16
17        while (left <= right) {
18
19            int mid = left + (right - left) / 2;
20
21            if (nums[mid] == target) {
22                ans = mid;
23                right = mid - 1;
24            }
25            else if (nums[mid] < target) {
26                left = mid + 1;
27            }
28            else {
29                right = mid - 1;
30            }
31        }
32
33        return ans;
34    }
35
36    private int last(int[] nums, int target) {
37
38        int left = 0;
39        int right = nums.length - 1;
40        int ans = -1;
41
42        while (left <= right) {
43
44            int mid = left + (right - left) / 2;
45
46            if (nums[mid] == target) {
47                ans = mid;
48                left = mid + 1;
49            }
50            else if (nums[mid] < target) {
51                left = mid + 1;
52            }
53            else {
54                right = mid - 1;
55            }
56        }
57
58        return ans;
59    }
60}