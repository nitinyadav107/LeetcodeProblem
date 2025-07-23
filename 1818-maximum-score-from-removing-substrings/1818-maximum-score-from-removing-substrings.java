class Solution {
    public int maximumGain(String s, int x, int y) {
        int p = 0;
        if (x > y) {
            p = x;
        } else {
            p = y;
        }
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int score = 0;

        if (p == x) {
            for (int i = 0; i < n; i++) {
                if (!st.isEmpty() && s.charAt(i) == 'b' && st.peek() == 'a') {
                    score += x;
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            }

            
            Stack<Character> tempStack = new Stack<>();
            while (!st.isEmpty()) {
                tempStack.push(st.pop());
            }

            while (!tempStack.isEmpty()) {
                char c = tempStack.pop();
                if (!st.isEmpty() && c == 'a' && st.peek() == 'b') {
                    score += y;
                    st.pop();
                } else {
                    st.push(c);
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (!st.isEmpty() && s.charAt(i) == 'a' && st.peek() == 'b') {
                    score += y;
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            }

            
            Stack<Character> tempStack = new Stack<>();
            while (!st.isEmpty()) {
                tempStack.push(st.pop());
            }

            while (!tempStack.isEmpty()) {
                char c = tempStack.pop();
                if (!st.isEmpty() && c == 'b' && st.peek() == 'a') {
                    score += x;
                    st.pop();
                } else {
                    st.push(c);
                }
            }
        }
        return score;
    }
}
