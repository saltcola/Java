
/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly 
preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
*/

public boolean xyzThere(String str) {
  int l = str.length();
  if (l <= 3 && !str.equals("xyz")) return false;
  if (str.equals("xyz")) return true;
  for ( int i = 0; i < l - 2; i++){
    if (i == 0 && str.charAt(i) == 'x' && i + 2 < l ){
      if (str.charAt(i+1) == 'y' && str.charAt(i+2) == 'z') return true;
    }
    if (str.charAt(i) == 'x' && i + 2 < l ){
      if (str.charAt(i+1) == 'y' && str.charAt(i+2) == 'z' 
          && str.charAt(i-1) != '.') return true;
    }
    
  }
  
  return false;
  
}