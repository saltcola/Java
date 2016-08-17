
/*
Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
*/

public int countHi(String str) {
  int l = str.length();
  int count = 0;
  if ( l < 2) return count;
  for (int i = 0; i < l-1; i++){
    if(str.substring(i,i+2).equals("hi")) count++;
  }
  return count;
}