
/*
Given an array of non-empty strings, return a Map<String, String> where for every 
different string in the array, 
there is a key of its first character with the value of its last character.

pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "n": "t", "m": "n"}
*/

public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap();
  for (String s:strings) {
    map.put(Character.toString(s.charAt(0)),Character.toString(s.charAt(s.length() -1)));
  }
  return map;
}
