
/*
Given an array of positive ints, return a new array of length "count" 
containing the first even numbers from the original array. 
The original array will contain at least "count" even numbers.

copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
*/

public int[] copyEvens(int[] nums, int count) {
  int n = 0, i = 0;
  int[] a = new int[count];
  while(n < nums.length && i < count){
    if ( nums[n] % 2 == 0){
      a[i] = nums[n];
      i++;
    }
    n++;
  }

  return a;
}
