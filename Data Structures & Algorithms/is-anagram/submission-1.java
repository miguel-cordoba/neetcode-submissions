class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charFrequencyForS = getCharFrequency(s);
        Map<Character, Integer> charFrequencyForT = getCharFrequency(t);

        return charFrequencyForS.equals(charFrequencyForT);
    }

    private Map<Character, Integer> getCharFrequency(String s) {
        Map<Character, Integer> result = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (result.containsKey(c)) {
                result.put(c, result.get(c) + 1);
            } else {
                result.put(c, 1);
            }
        }
        return result;
    }
}
