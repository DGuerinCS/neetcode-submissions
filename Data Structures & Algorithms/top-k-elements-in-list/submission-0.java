class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num: nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1 );
        }
        // 1) Create n empty buckets
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i <= nums.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // 2) Put array elements in different buckets
        for (Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            buckets[freq].add(num);
        }

        List<Integer> result = new ArrayList();
        for(int i = buckets.length -1; i >= 0 && result.size() < k; i--){
            result.addAll(buckets[i]);
        }
        int[] res = new int[k];
        for(int i =0; i< k; i++){
            res[i] = result.get(i);
        }
        return res;
    }
}
