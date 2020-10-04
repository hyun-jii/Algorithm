// hashmap을 이용하여 풀이 - 2 ms	41.6 MB
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        
        for(int i=0; i<nums.length; i++) {
            int number = target - nums[i];
            if(map.containsKey(number)) {
                result[0] = i;
                result[1] = map.get(number);
                break;
            }
            map.put(nums[i], i);
        }
        
        return result;
    }
}

// arraylist를 이용하여 풀이 - 133 ms	39.4 MB
class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int number = 0;
        
        
        for(int i=0; i<nums.length; i++) {
            number = target - nums[i];
            if(list.contains(number)) {
                int index = list.indexOf(number);
                if(index == i) {
                    continue;
                }
                return new int[] {i, index};
            }
            list.add(nums[i]);
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }
}
