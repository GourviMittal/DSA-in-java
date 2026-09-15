1import java.util.*;
2
3class Solution {
4
5    public List<Integer> addToArrayForm(int[] num, int k) {
6
7        List<Integer> result = new ArrayList<>();
8
9        int i = num.length - 1;
10        int carry = k;
11
12        while (i >= 0 || carry > 0) {
13
14            if (i >= 0) {
15                carry += num[i];
16                i--;
17            }
18
19            result.add(carry % 10);
20            carry /= 10;
21        }
22
23        Collections.reverse(result);
24
25        return result;
26    }
27}