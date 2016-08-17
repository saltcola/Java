
/*
Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
*/

public boolean endsLy(String str) {
  int l = str.length();
  if (l < 2) return false;
  return str.substring(l-2).equals("ly");
}