
/*
Return true if the given string contains a "bob" string, 
but where the middle 'o' char can be any char.

bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
*/

public boolean bobThere(String str) {
  int l = str.length();
  if (l<3) return false;
  for (int i = 0; i< l-2; i++){
    if( str.charAt(i) == 'b' && str.charAt(i +2) == 'b') return true;
  }
  return false;
}