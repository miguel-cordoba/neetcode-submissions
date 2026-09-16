class Solution {
    public int[] twoSum(int[] nums, int target) {
       Hashtable<Integer, Integer> valueIndexTable = new Hashtable<>();
       valueIndexTable.put(nums[0], 0);

       for(int i = 1; i < nums.length; i++){
        if(valueIndexTable.containsKey(target - nums[i])){
            return new int[]{valueIndexTable.get(target - nums[i]), i};
        } else {
            valueIndexTable.put(nums[i], i);
        }
       }
       return null;
    }
}
