
/*
Given a string, return a string where every appearance of the lowercase word "is" 
has been replaced with "is not". The word "is" should not be immediately preceeded or 
followed by a letter -- so for example the "is" in "this" does not count. 
(Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
*/

public String notReplace(String str) {
  int l = str.length();
  String s = "";
  for ( int i = 0; i < l; i++){
      if ( Character.isLetter(str.charAt(i))){
          if (i== 0 && i+ 2 < l && str.charAt(i) == 'i' && str.charAt(i+1) == 's'
                  && !Character.isLetter(str.charAt(i+2))
                  ||(i== 0 && i+ 1 == l - 1 && str.charAt(i) == 'i'&& str.charAt(i+1) == 's')){
              s = s + "is not";
              i = i + 1;
              continue;
          }
          s = s + str.charAt(i);
      }else{
          if ( i+ 3 < l && str.charAt(i+1) == 'i' && str.charAt(i+2) == 's'
                  && !Character.isLetter(str.charAt(i+3))
                  ||( i+ 2 == l - 1 && str.charAt(i+1) == 'i'&& str.charAt(i+2) == 's')){
              s = s + str.charAt(i) + "is not";
              i = i + 2;
              continue;
          }
          s = s + str.charAt(i);
      }
  }
  return s;
}
