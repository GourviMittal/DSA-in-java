1import java.util.*;
2
3class Solution {
4
5    public String[] sortPeople(
6        String[] names,
7        int[] heights
8    ) {
9
10        Integer[] index = new Integer[names.length];
11
12        for (int i = 0; i < names.length; i++) {
13            index[i] = i;
14        }
15
16        Arrays.sort(index, (a, b) ->
17            Integer.compare(heights[b], heights[a])
18        );
19
20        String[] result = new String[names.length];
21
22        for (int i = 0; i < names.length; i++) {
23            result[i] = names[index[i]];
24        }
25
26        return result;
27    }
28}