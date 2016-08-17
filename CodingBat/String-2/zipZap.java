
/*
Look for patterns like "zip" and "zap" in the string -- length-3, 
starting with 'z' and ending with 'p'. Return a string where for all such words, 
the middle letter is gone, so "zipXzap" yields "zpXzp".

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
*/

public String zipZap(String str) {
  String s = "";
  for (int i = 0; i < str.length(); i ++){
    if ( str.charAt(i) == 'z'){
      if ( i + 2 < str.length() && str.charAt(i+2) == 'p'){
        s = s + "zp";
        i = i+2;
        continue;
      }
    }
    s = s + str.charAt(i);
  }
  return s;
}