
/*
Given a string, 
return a version where all the "x" have been removed. 
Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
*/

public String stringX(String str) {
  int len = str.length();
  if (len == 0) return "";
  if (len == 1 && str.equals("x")) return str;
  String head = str.substring(0,1);
  String tail = str.substring(len-1,len);
  String result = "";
  for (int i = 1; i < len -1; i++){
    if(!str.substring(i,i+1).equals("x"))
    result += str.substring(i,i+1);
  }
  return head+result+tail;
}