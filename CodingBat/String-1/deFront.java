
/*
Given a string, return a version without the first 2 chars.
 Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
 The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
*/

public String deFront(String str) {    
  String result = "";
  int i = 0;
  while(i < str.length()){
    if (i==0 && str.charAt(i) == 'a') {
      result = result + "a";
      i++;
      continue;
    }
    if (i==1 && str.charAt(i) == 'b') {
      result = result + "b";
      i++;
      continue;
    }
    if (i != 0 && i != 1){
      result = result + str.charAt(i);
      i++;
      continue;
    }
    i++;
  }
  return result;
}
