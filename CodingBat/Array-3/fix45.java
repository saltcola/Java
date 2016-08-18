
/*
(This is a slightly harder version of the fix34 problem.) 
Return an array that contains exactly the same numbers as the given array, 
but rearranged so that every 4 is immediately followed by a 5. 
Do not move the 4's, but every other number may move. 
The array contains the same number of 4's and 5's, 
and every 4 has a number after it that is not a 4. 
In this version, 5's may appear anywhere in the original array.

fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
*/

public int[] fix45(int[] nums) {
  int l = nums.length;
  int four = 0;
  Queue<Integer> fives = new LinkedList();
  int n = 0;
  for (int i = 0; i< l; i++){
      if(nums[i] == 4) {
          n = i;
          n++;
          if (nums[n]== 5){
              i++;
          }else{
              four = n;
              while (n < l) {
                  if(!fives.isEmpty()){
                      int five = fives.poll();
                      nums[five] = nums[n];
                      nums[n] = 5;
                      i = n;
                      break;
                  }else if (nums[n] == 5) {
                      nums[n] = nums[four];
                      nums[four] = 5;
                      i++;
                      break;
                  }
                  n++;
              }
          }
      }else if(nums[i] == 5){
          fives.add(i);
      }
  }
  return nums;
}
