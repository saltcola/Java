
/*
Return an array that contains exactly the same numbers as the given array, 
but rearranged so that every 3 is immediately followed by a 4. 
Do not move the 3's, but every other number may move. 
The array contains the same number of 3's and 4's, 
every 3 has a number after it that is not a 3 or 4, and a 3 appears in the array before any 4.

fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
*/

public int[] fix34(int[] nums) {
  int l = nums.length;
  int three = 0;
  int four = 0;
  int n = 0;
  for (int i = 0; i< l; i++){
      if(nums[i] == 3) {
          n = i;
          n++;
          three = n;
          while (n < l) {
              if (four != 0) {
                  nums[four] = nums[n];
                  nums[n] = 4;
                  four = 0;
                  break;
              }
              if (nums[n] == 4) {
                  nums[n] = nums[three];
                  nums[three] = 4;
                  i++;
                  break;
              }
              n++;
          }
      }else if(nums[i] == 4){
          four = i;
      }
  }
  return nums;
}
