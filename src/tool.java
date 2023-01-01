public class tool {
    public int MaxSubSumOfSequence(int nums[]) {
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("子数组之和的最大值为："+maxSum);
        return maxSum;
    }
}
