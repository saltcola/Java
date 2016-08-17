
/*
Given a string, return the length of the largest "block" in the string. 
A block is a run of adjacent chars that are the same.

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
*/

public int maxBlock(String str) {
  int l = str.length();
  if (l == 0) return 0;
  char target = str.charAt(0);
  int max = 0;
  int count = 1;
  for (int i = 1; i < l; i++){
    if( str.charAt(i) == target ){
      count ++;
    }else{
      target = str.charAt(i);
      max = Math.max(max, count);
      count = 1;
    }
  }
  return Math.max(max,count);
}