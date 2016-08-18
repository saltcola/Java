
/*
We'll say that a "mirror" section in an array is a group of contiguous elements such that 
somewhere in the array, the same group appears in reverse order. 
For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). 
Return the size of the largest mirror section found in the given array.

maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
*/

public int maxMirror(int[] nums) {
  int max = 0;
  int l = nums.length;
  for (int i = 0; i < l; i++){
      int j = l-1;
      int k = i;
      while(j >= k){
          if(nums[k] == nums[j]){
              int count = 1;
              if(k+ 1 == j){
                  count = 2;
              }
              k ++;
              j --;
              while(k<=j){
                  if(nums[k] == nums[j]){
                      if (k == j){
                          if(count == 1){
                              count = 3;
                          }else{
                              count = count*2 + 1;
                          }                                
                      }else if(k + 1 == j){
                          count = count *2;
                      }else{
                          count ++;
                      }
                  }else{
                      break;
                  }
                  k ++;
                  j --;
              }
              max = Math.max(max, count);
              k = i;
              continue;
          }else{
              j--;
          }
      }
  }
  return max;
}
