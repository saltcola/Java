
/*
Given an array of ints, return true if the array contains a 2 next to 
a 2 or a 4 next to a 4, but not both.

either24([1, 2, 2]) → true
either24([4, 4, 1]) → true
either24([4, 4, 1, 2, 2]) → false
*/

public boolean either24(int[] nums) {
  boolean two  = false , four = false;
  int l = nums.length;
  for(int i = 0; i < l; i++){
    if ( nums[i] == 2){
      if (i + 1 < l && nums[i+1] == 2){
        two = true;
      }
    }
    if ( nums[i] == 4){
      if (i + 1 < l && nums[i+1] == 4){
        four = true;
      }
    }
  }
  
  return two^four;
}