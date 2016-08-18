
/*
Return true if the array contains, somewhere, 
three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

tripleUp([1, 4, 5, 6, 2]) → true
tripleUp([1, 2, 3]) → true
tripleUp([1, 2, 4]) → false
*/

public boolean tripleUp(int[] nums) {
  int l = nums.length;
  int i = 0;
  if (l < 3) return false;
  while (i < l){
    if ( i+2 < l && nums[i + 1] == nums[i] +1 && nums[i+2] == nums[i + 1]+1 ){
      return true;
    }
    i++;
  }
  return false;
}