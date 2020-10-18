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


// 17 ms	43.1 MB - HashSet 이용 x
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0; i< nums.length; i++) {
            // 첫번째 원소가 양수이면, nums 배열이 양수만 존재하므로 return
            if(nums[i] > 0) {
                return result;
            }
            
            // 중복 제거
            if(i>0 && nums[i] == nums[i-1]) {
                continue;    
            }
            
            int left = i+1;
            int right = nums.length-1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if(sum > 0) {
                    right--;
                }
                else if(sum < 0) {
                    left++;
                }
                else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // 중복 제거
                    while(left<right && nums[left] == nums[left-1]) {
                        left++;
                    }
                    while(left<right && nums[right] == nums[right+1]) {
                        right--;
                    }   
                }   
            }  
        }
        return result;
    }
}
