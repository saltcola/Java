
/*

Given a string, if one or both of the first 2 chars is 'x', 
return the string without those 'x' chars, 
and otherwise return the string unchanged. 
This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
*/

public String withoutX2(String str) {
  int l = str.length();
  if (l == 0 ||(l == 1 && str.equals("x"))) return "";
  if (l == 1) return str;
  String result = "";
  for (int i = 0; i <l ; i++){
    if ((i == 0 || i == 1) && str.charAt(i) == 'x'){
      continue;
    }
    result += str.charAt(i);
  }
  return result;
  
}
