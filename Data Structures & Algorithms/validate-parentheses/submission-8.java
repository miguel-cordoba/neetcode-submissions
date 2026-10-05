class Solution {
    Stack<Character> openingStack = new Stack<>();

    public boolean isValid(String s) {
        int right = 0;

        while (right < s.length()) {
            switch (s.charAt(right)) {
                case '(':
                    openingStack.push(s.charAt(right));
                    break;
                case '{':
                    openingStack.push(s.charAt(right));
                    break;
                case '[':
                    openingStack.push(s.charAt(right));
                    break;
            
                case ')':
                    if (!openingStack.isEmpty() && openingStack.peek() == '(') {
                        openingStack.pop();
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if (!openingStack.isEmpty() && openingStack.peek() == '{' ) {
                        openingStack.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']':
                System.out.println("opening : " + openingStack.toString());
                    if (!openingStack.isEmpty() && openingStack.peek() == '[') {
                        openingStack.pop();
                    } else {
                        return false;
                    }
                    break;
            }
            right++;
        }
        return openingStack.isEmpty();
    }
}
