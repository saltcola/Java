
/*
Given a string, return a string where for every char in the original, 
there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
*/

public String doubleChar(String str) {
  int l = str.length();
  String result = "";
  for (int i = 0; i < l; i++){
    result = result+ str.charAt(i)+str.charAt(i);
  }
  return result;
}