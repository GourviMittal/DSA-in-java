
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> ans = new ArrayList<>();

        int wordLen = words[0].length();
        int totalWords = words.length;
        int totalLen = wordLen * totalWords;

        if (s.length() < totalLen) {
            return ans;
        }

        // Store frequency of each word
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Try different starting offsets
        for (int i = 0; i < wordLen; i++) {

            HashMap<String, Integer> seen = new HashMap<>();

            int left = i;
            int count = 0;

            for (int right = i; right + wordLen <= s.length(); right += wordLen) {

                String word = s.substring(right, right + wordLen);

                // Word is not present in words
                if (!map.containsKey(word)) {
                    seen.clear();
                    count = 0;
                    left = right + wordLen;
                    continue;
                }

                seen.put(word, seen.getOrDefault(word, 0) + 1);
                count++;

                // Too many occurrences of current word
                while (seen.get(word) > map.get(word)) {

                    String leftWord = s.substring(left, left + wordLen);

                    seen.put(leftWord, seen.get(leftWord) - 1);

                    left += wordLen;
                    count--;
                }

                // All words matched
                if (count == totalWords) {
                    ans.add(left);

                    String leftWord = s.substring(left, left + wordLen);

                    seen.put(leftWord, seen.get(leftWord) - 1);

                    left += wordLen;
                    count--;
                }
            }
        }

        return ans;
    }
}
