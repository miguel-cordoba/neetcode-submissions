class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> frequencyS = getFrequencyMap(s);
        Map<Character, Integer> frequencyT = getFrequencyMap(t);

        return frequencyS.equals(frequencyT);
    }

    private Map<Character, Integer> getFrequencyMap(String x){
        Map<Character, Integer> result = new HashMap<>();

         for(int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);

            if (result.containsKey(c)) {
                result.put(c, result.get(c) + 1);
            } else {
                result.put(c, 1);
            }
        }
        return result;
    }
}
