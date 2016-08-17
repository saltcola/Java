
/*
Given 2 int arrays, a and b, of any length, 
return a new array with the first element of each array. 
If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
*/

public int[] front11(int[] a, int[] b) {
  int lA = a.length, lB = b.length;
  if( lA == 0 && lB != 0){
    int[] result = new int[1];
    result[0] = b[0];
    return result;
  }
  if( lA != 0 && lB == 0){
    int[] result = new int[1];
    result[0] = a[0];
    return result;
  }
  if( lA == 0 && lB == 0){
    int[] result = {};
    return result;
  }
  int[] result = new int[2];
  result[0] = a[0];
  result[1] = b[0];
  return result;
}
