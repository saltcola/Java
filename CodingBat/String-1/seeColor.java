
/*
Given a string, 
if the string begins with "red" or "blue" return that color string, 
otherwise return the empty string.

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
*/

public String seeColor(String str) {
  int l = str.length();
  if (l >= 3 && str.substring(0,3).equals("red")) return "red";
  if (l >= 4 && str.substring(0,4).equals("blue")) return "blue";
  return "";
  
}
