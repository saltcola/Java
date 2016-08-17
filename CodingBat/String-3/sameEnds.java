
/*
Given a string, return the longest substring that appears at both the beginning and 
end of the string without overlapping. For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
*/

public String sameEnds(String string) {
  int l = string.length();
  String s ="";
  for(int i = 1; i < l; i++){
    String head = string.substring(0,i);
    if (string.lastIndexOf(head) == l - i && i <= l-i){
      s = head;
    }
    
  }
  return s;
}