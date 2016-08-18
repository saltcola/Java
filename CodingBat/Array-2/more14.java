
/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
*/

public boolean more14(int[] nums) {
  int c1 = 0, c4 = 0, l = nums.length;
  for(int i = 0; i < l; i++){
    if ( nums[i] == 1 ) c1 ++;
    if ( nums[i] == 4 ) c4 ++;
  }
  return c1 > c4;
}

