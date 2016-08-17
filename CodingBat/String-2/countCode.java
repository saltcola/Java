
/*
Return the number of times that the string "code" appears anywhere in the given string, 
except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
*/

public int countCode(String str) {
  int l = str.length();
  int count = 0;
  if ( l < 4) return count;
  for (int i = 0; i < l-3; i++){
    if(str.substring(i,i+2).equals("co") && str.charAt(i+3) == 'e') count++;
  }
  return count;
}