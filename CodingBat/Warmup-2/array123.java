
/*
Given an array of ints, 
return true if .. 1, 2, 3, .. appears in the array somewhere.

array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
*/

public boolean array123(int[] nums) {
  int n = nums.length;
  if ( n < 3 ) return false;
  for ( int i = 0; i < n -2; i ++){
    if ( nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3){
      return true;
    }
  }
  return false;
}
