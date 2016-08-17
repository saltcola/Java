
/*
Given a string, if the first or last chars are 'x', 
return the string without those 'x' chars, 
and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
*/

public String withoutX(String str) {
  int l = str.length();
  if (l == 0) return "";
  if (l == 1 && str.equals("x")) return "";
  if (l == 1 && !str.equals("x")) return str;
  String head = (str.substring(0,1).equals("x"))?"":str.substring(0,1);
  String tail = (str.substring(l-1).equals("x"))?"":str.substring(l-1);
  return head + str.substring(1,l-1)+ tail;
}
