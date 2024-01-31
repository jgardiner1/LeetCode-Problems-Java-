import java.sql.Array;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int smallestWindowSize = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];

            if (sum >= target){
                smallestWindowSize = i;
                break;
            }
        }

        if (smallestWindowSize == 0){
            return 0;
        }

        int startPos = 1;

        while(startPos < nums.length - 1){
            sum = calcSubarray(nums, startPos, smallestWindowSize - 1);

            if (sum >= target){
                smallestWindowSize -= 1;
            } else {
                startPos += 1;
            }
        }

        return smallestWindowSize;
    }

    public int calcSubarray(int[] nums, int startIndex, int windowSize){
        int sum = 0;

        for (int i = startIndex; i < startIndex + windowSize; i++){
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        MinimumSizeSubarraySum msa = new MinimumSizeSubarraySum();

        System.out.println(msa.minSubArrayLen(11, new int[]{1,2,3,4,5}));
    }
}
