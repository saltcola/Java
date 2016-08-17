
/*
Given 2 int arrays, each length 2, 
return a new array length 4 containing all their elements.

plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
*/

public int[] plusTwo(int[] a, int[] b) {
  int[] newA = new int[4];
  newA[0] = a[0];
  newA[1] = a[1];
  newA[2] = b[0];
  newA[3] = b[1];
  
  return newA;
  
}