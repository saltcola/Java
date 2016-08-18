
/*
Given a non-empty array, return true if there is a place to split the array so that the sum of 
the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
*/

public boolean canBalance(int[] nums) {
  int sumAll = 0, sumFront = 0;
  int l = nums.length;
  for (int i = 0; i < l; i++){
    sumAll += nums[i]; 
  }
  for (int i = 0; i < l; i++){
    sumFront += nums[i];
    if ( sumFront == sumAll - sumFront){
      return true;
    }
  }
  return false;
}
