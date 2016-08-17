
/*
Given a string and a non-empty word string, 
return a version of the original String where all chars have been replaced by pluses ("+"), 
except for appearances of the word string which are preserved unchanged.

plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
*/

public String plusOut(String str, String word) {
  String result = "";
  int ls = str.length(), lw = word.length();
  for (int i = 0; i < ls; i++){
    if(i+lw <= ls){
      if ( str.substring(i, i+lw).equals(word) ){
        result = result + word;
        i = i + lw-1 ;
        continue;
      }
    }
    result = result + "+";
  }
  return result;
  
}