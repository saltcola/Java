
/*
Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false
*/

public boolean has22(int[] nums) {
  int l = nums.length;
  int i = 0;
  while(i<l){
    if(nums[i] == 2){
      i++;
      while(i<l){
        if(nums[i] == 2){
          return true;
        }
        break;
      }
    }
    i++;
  }
  return false;
}