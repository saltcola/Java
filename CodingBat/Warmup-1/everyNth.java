
/*
Given a non-empty string and an int N, 
return the string made starting with char 0, 
and then every Nth char of the string. 
So if N is 3, use char 0, 3, 6, ... and so on.
N is 1 or more.

everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
*/

public String everyNth(String str, int n) {
  int len = str.length();
  String s = str.substring(0,1);
  for (int i = n; i < len; i = i + n){
    s = s + str.charAt(i);
  }
  return s;
}
