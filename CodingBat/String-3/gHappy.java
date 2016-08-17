
/*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' 
immediately to its left or right. Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
*/

public boolean gHappy(String str) {
  int l = str.length();
  if ( l == 1 && str.charAt(0) == 'g') return false;
  for(int i = 0; i < l; i++){
    if (str.charAt(i) == 'g'){
      if (i == 0 && i + 1 < l && str.charAt(i+1) != 'g'){
        return false;
      }
      if ( i+1 < l &&  str.charAt(i+1) != 'g' && str.charAt(i-1) != 'g'){
        return false;
      }
      if ( i == l-1 && str.charAt(i-1) != 'g'){
        return false;
      }
    }
  }
  return true;
}