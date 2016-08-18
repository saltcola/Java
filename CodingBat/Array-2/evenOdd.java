
/*
Return an array that contains the exact same numbers as the given array, 
but rearranged so that all the even numbers come before all the odd numbers. 
Other than that, the numbers can be in any order. 
You may modify and return the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
*/

public int[] evenOdd(int[] nums) {
  int l = nums.length;
  int even = 0;
  int[] a = new int[l];
  for(int i= 0;i < l;i++){
    if ( nums[i] % 2 == 0){
      a[even] = nums[i];
      even++;
    }
  }
  for(int i= 0;i < l;i++){
    if ( nums[i] % 2 != 0){
      a[even] = nums[i];
      even++;
    }
  }
  return a;
}
