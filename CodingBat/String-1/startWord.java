
/*
Given a string and a second "word" string, 
we'll say that the word matches the string 
if it appears at the front of the string, 
except its first char does not need to match exactly. 
On a match, return the front of the string, 
or otherwise return the empty string. 
So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". 
The word will be at least length 1.

startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"
*/

public String startWord(String str, String word) {
  int ls = str.length(), lw = word.length();
  if(lw > ls) return "";
  if(ls == 0) return "";
  int min = Math.min(ls, lw);
  if (min == 1) return str.substring(0,1);
  String result = "";
  for (int i = 0; i < min; i++){
    if( i == 0 && i + 1 < min && str.charAt(1) == word.charAt(1)){
      result += str.substring(0,2);
      i = 1;
      continue;
    }
    if( i == 0 && i + 1 < min && str.charAt(1) != word.charAt(1)){
      break;
    }
    if (str.charAt(i) == word.charAt(i)){
      result += str.charAt(i);
    }else{
      return "";
    }
  }
  return result;
}
