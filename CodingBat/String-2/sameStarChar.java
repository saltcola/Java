
/*
Returns true if for every '*' (star) in the string, 
if there are chars both immediately before and after the star, they are the same.

sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
*/

public boolean sameStarChar(String str) {
  int l = str.length();
  for (int i = 0; i < l; i++){
    if ( str.charAt(i) == '*'){
      if ( i -1 >= 0 && i+1  < l && str.charAt(i-1) != str.charAt(i+1)) return false;
    }
  }
  return true;
  
}