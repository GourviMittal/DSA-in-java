1
2class Solution {
3    public boolean isPalindrome(int x) {
4
5        if (x < 0) {
6            return false;
7        }
8
9        int original = x;
10        int reverse = 0;
11
12        while (x > 0) {
13            int digit = x % 10;
14            reverse = reverse * 10 + digit;
15            x = x / 10;
16        }
17
18        return original == reverse;
19    }
20}
21
22