1import java.util.Stack;
2
3class Solution {
4    public String simplifyPath(String path) {
5
6        Stack<String> stack = new Stack<>();
7
8        
9        String[] parts = path.split("/");
10
11        for (String part : parts) {
12
13            if (part.equals("") || part.equals(".")) {
14                continue;
15            }
16
17            
18            else if (part.equals("..")) {
19                if (!stack.isEmpty()) {
20                    stack.pop();
21                }
22            }
23
24           
25            else {
26                stack.push(part);
27            }
28        }
29
30        StringBuilder result = new StringBuilder();
31
32        for (String dir : stack) {
33            result.append("/").append(dir);
34        }
35
36        
37        if (result.length() == 0) {
38            return "/";
39        }
40
41        return result.toString();
42    }
43}