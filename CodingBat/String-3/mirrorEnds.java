
/*
Given a string, look for a mirror image (backwards) string at both the beginning and 
end of the given string. In other words, zero or more characters at the very begining of 
the given string, and at the very end of the string in reverse order (possibly overlapping). 
For example, the string "abXYZba" has the mirror end "ab".

mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
*/

public String mirrorEnds(String string) {
  int l = string.length();
  if (l == 1) return string;
  String s ="";
  for(int i = 1; i < l; i++){
    String head = string.substring(0,i);
    StringBuilder head1 = new StringBuilder();
    head1.append(head);
    head1=head1.reverse(); 
    if (string.lastIndexOf(head1.toString()) == l - i){
      if(i == l/2 + 1){
        s = string;
        return s;
      }
      s = head;
    }
    
  }
  return s;
}