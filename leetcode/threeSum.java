// 1083 ms	44 MB
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Set<Integer> threeSum = new HashSet<>();
        
        Arrays.sort(nums);
        
        if(nums.length < 3) {
            return new ArrayList<>();
        }
        
        for(int i=0; i<nums.length; i++) {
            int result = -nums[i];
            threeSum.clear();
            for(int j=i+1; j<nums.length; j++) {
                if(threeSum.contains(result - nums[j])) {
                    set.add(Arrays.asList(nums[i], nums[j], (result - nums[j])));
                }
                threeSum.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    } 
}
