
/*
Given an array of ints, return true if every 2 that appears 
in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
*/

public boolean twoTwo(int[] nums) {
  int l = nums.length;
  for(int i =0; i < l; i++){
    if ( nums[i] == 2){
      if (i +1 <l && nums[i+1] == 2){
        i++;
        continue;
      }else{
        if ( i == l-1 && i-1 >=0 && nums[i-1] == 2) return true;
        return false;
      }
    }
  }
  return true;
}