class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> hottest = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!hottest.isEmpty()) {
                int stackIndex = hottest.peek();
                int stackTopTemp = temperatures[stackIndex];
                if (stackTopTemp < temperatures[i]) {
                    hottest.pop();
                    answer[stackIndex] = i - stackIndex;
                } else {
                    break;
                }
            }
            hottest.push(i);
        }
        return answer;
    }
}