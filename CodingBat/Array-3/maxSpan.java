
/*
Consider the leftmost and righmost appearances of some value in an array. 
We'll say that the "span" is the number of elements between the two inclusive. 
A single value has a span of 1. Returns the largest span found in the given array. 
(Efficiency is not a priority.)

maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
*/

public int maxSpan(int[] nums) {
  Map<Integer,Integer[]> map = new HashMap();
  int max = 0;
  if (nums.length == 0) return 0;
  for(int i = 0; i < nums.length; i++){
    int key = nums[i];
    if(map.containsKey(key)){
      Integer[] value = map.get(key) ;
      value[1] = i;
      map.put(key,value);
      max = Math.max(max, value[1] - value[0]);
    }else{
      Integer[] value = {i,i};
      map.put(key,value);
    }
  }
  return max+1 ;
}