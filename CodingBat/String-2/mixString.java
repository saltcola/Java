
/*
Given two strings, a and b, create a bigger string made of the first char of a, 
the first char of b, the second char of a, the second char of b, and so on. 
Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
*/

public String mixString(String a, String b) {
  int la = a.length(), lb = b.length();
  int len = 0;
  if ( la >= lb ) len = lb;
  else len = la;
  String result = ""; 
  for (int i = 0; i < len; i++){
    result = result + a.charAt(i) + b.charAt(i);
  }
  
  if ( la >= lb ) return result + a.substring(len);
  else  return result + b.substring(len);
}
