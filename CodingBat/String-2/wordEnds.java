
/*
Given a string and a non-empty word string, 
return a string made of each char just before and just after every appearance of the word
 in the string. Ignore cases where there is no char before or after the word, 
 and a char may be included twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
*/

public String wordEnds(String str, String word) {
  String result = "";
  int ls = str.length(), lw = word.length();
  for(int i = 0; i <= ls - lw; i++){
    if (str.substring(i,i+lw).equals(word)){
      if (i >= 1){
        result = result + str.charAt(i-1);
      } 
      if (i + lw < ls ) {
        result = result + str.charAt(i+lw);
      }
    }
  }
  return result;
}
