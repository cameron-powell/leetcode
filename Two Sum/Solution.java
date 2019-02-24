import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indicesMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            indicesMap.put(nums[i], i);
        }

        int index1 = -1;
        int index2 = -1;
        boolean found = false;
        for(int i=0; i<nums.length; i++) {
            if(found) {
                break;
            }
            int need = target - nums[i];
            if(indicesMap.containsKey(need)) {
                int needIndex = indicesMap.get(need);
                if(i != needIndex) {
                    index1 = i;
                    index2 = needIndex;
                    found = true;
                    break;
                }
            }
        }
        int[] answer = {index1, index2};
        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assert Arrays.equals(result, new int[]{0, 1}) : "Failed example";
        System.out.println("Passed example");
    }
}