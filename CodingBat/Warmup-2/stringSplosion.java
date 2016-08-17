
/*
Given a non-empty string like "Code" return a string like "CCoCodCode".

stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
*/

public String stringSplosion(String str) {
  int len = str.length();
  if ( len == 1 ) return str;
  String result = "";
  for (int i = len; i > 0; i --){
    result = str.substring(0,i) + result;
  }
  return result;
}
