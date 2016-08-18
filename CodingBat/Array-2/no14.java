
/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
*/

public boolean no14(int[] nums) {
  boolean one = false, four = false;
  if (nums.length < 2) return true;
  for (int i = 0; i < nums.length; i++){
    if (nums[i] == 1) one = true;
    if (nums[i] == 4) four = true;
  }
  
  return one^four;
}
