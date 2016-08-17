
/*
Given two strings, return true if either of the strings appears at the very end of the other string, 
ignoring upper/lower case differences 
(in other words, the computation should not be "case sensitive"). 
Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
*/

public boolean endOther(String a, String b) {
  int lA = a.length(), lB = b.length();
  return (lA>lB)?help(b,a):help(a,b);
}

public boolean help(String s, String l){
  int lS = s.length(), lL = l.length();
  return l.substring(lL-lS).toLowerCase().equals(s.toLowerCase());
}