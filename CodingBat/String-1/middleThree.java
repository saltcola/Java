
/*
Given a string of odd length, 
return the string length 3 from its middle, 
so "Candy" yields "and". 
The string length will be at least 3.

middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
*/

public String middleThree(String str) {
  int l = str.length();
  return str.substring(l/2-1,l/2+2);
}
