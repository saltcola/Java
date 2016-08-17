
/*
Given an array of ints, return true if the array is length 1 or more, 
and the first element and the last element are equal.

sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
*/

public boolean sameFirstLast(int[] nums) {
  int l = nums.length;
  return l >= 1 && nums[0] == nums[l-1];
}