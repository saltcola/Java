
/*
Given a string, 
return a string length 2 made of its first 2 chars. 
If the string length is less than 2, use '@' for the missing chars.

atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
*/

public String atFirst(String str) {
  int l = str.length();
  switch(l){
    case 0: return "@@";
    case 1: return str + "@";
    default: return str.substring(0,2);
  }
}
