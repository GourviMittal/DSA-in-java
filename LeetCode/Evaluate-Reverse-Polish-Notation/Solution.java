1import java.util.Stack;
2
3class Solution {
4    public int evalRPN(String[] tokens) {
5        Stack<Integer> stack = new Stack<>();
6
7        for (String token : tokens) {
8
9            if (!token.equals("+") &&
10                !token.equals("-") &&
11                !token.equals("*") &&
12                !token.equals("/")) {
13
14                stack.push(Integer.parseInt(token));
15            }
16
17            
18            else {
19                int b = stack.pop();
20                int a = stack.pop();
21
22                int result = 0;
23
24                if (token.equals("+")) {
25                    result = a + b;
26                } 
27                else if (token.equals("-")) {
28                    result = a - b;
29                } 
30                else if (token.equals("*")) {
31                    result = a * b;
32                } 
33                else if (token.equals("/")) {
34                    result = a / b;
35                }
36
37                stack.push(result);
38            }
39        }
40
41        return stack.pop();
42    }
43}