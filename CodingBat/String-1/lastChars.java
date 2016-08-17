
/*
Given 2 strings, a and b, 
return a new string made of the first char of a and the last char of b, 
so "yo" and "java" yields "ya". 
If either string is length 0, use '@' for its missing char.

lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
*/

public String lastChars(String a, String b) {
  String headA = "", tailB = "";
  int lA = a.length(), lB = b.length();
  if (lA == 0){
    headA = "@";
  }else{
    headA = a.substring(0,1);
  }
  if (lB == 0){
    tailB = "@";
  }else{
    tailB = b.substring(lB-1);
  }
  return headA+tailB;
}