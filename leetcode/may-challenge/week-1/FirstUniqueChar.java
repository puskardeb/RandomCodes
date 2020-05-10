class Solution {
    public int firstUniqChar(String s) {
        int[] map = new int[26];
        char[] str = s.toCharArray();
        Arrays.fill(map, 0);

        for (char c : str) {
            ++map[c - 'a'];
        }

        for (int i = 0; i < str.length; ++i) { 
            if (map[str[i] - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
