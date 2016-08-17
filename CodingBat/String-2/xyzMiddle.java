
/*
Given a string, does "xyz" appear in the middle of the string? 
To define middle, we'll say that the number of chars to the left and 
right of the "xyz" must differ by at most one. This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
*/

public boolean xyzMiddle(String str) {
  int l = str.length();
  if (l < 3) return false;
  int n = ( l - 3)/2;
  if ( str.substring (n,n+3).equals("xyz") || 
      ((l-3)%2 != 0 && n+4 < l && str.substring(n+1, n+4).equals("xyz"))){
        return true;
      }
  return false;
}
 