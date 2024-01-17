class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        Set<Integer> s = new HashSet<>();
        for(int x: map.values()){
            s.add(x);
        }
        return map.size() == s.size();
    }
}
