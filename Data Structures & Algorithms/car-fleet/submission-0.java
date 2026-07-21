class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] carSheet = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            carSheet[i][0] = position[i];
            carSheet[i][1] = speed[i];
        }
        Arrays.sort(carSheet, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> times = new Stack<>();
        for (int i = 0; i < speed.length; i++) {
            double time = (double) (target - carSheet[i][0]) / carSheet[i][1];
            if (times.isEmpty() || times.peek() < time) {
                times.push(time);
            }
        }
        return times.size();
    }
}