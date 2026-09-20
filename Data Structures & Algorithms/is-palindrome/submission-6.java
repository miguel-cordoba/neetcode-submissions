class Solution {
    public boolean isPalindrome(String s) {
        int j = s.length() - 1;
        int i = 0;

        while (i < j) {
            while (i < j && !isAlphaNumeric(s.charAt(i))) {
                i++;
            }
            while (i < j && !isAlphaNumeric(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }

    private boolean isAlphaNumeric(Character character) {
        if ((character >= '0' && character <= '9') || (character >= 'a' && character <= 'z')
            || (character >= 'A' && character <= 'Z')) {
            return true;
        } else {
            return false;
        }
    }
}
