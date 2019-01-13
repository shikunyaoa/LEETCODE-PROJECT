class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {


            int complate = target - nums[i];
            if (map.containsKey(complate) && map(complate) != i) {
                return new int[]{i, map.get(complate)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException('No two sum solution');

    }
}