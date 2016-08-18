
/*
Given an array of non-empty strings, return a Map<String, String> with a key 
for every different first character seen, with the value of all the strings starting with
 that character appended together in the order they appear in the array.

firstChar(["salt", "tea", "soda", "toast"]) → {"t": "teatoast", "s": "saltsoda"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"d": "d", "b": "bb", "c": "cccCC", "a": "aaaAA"}
firstChar([]) → {}
*/

public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap();
  for (String s:strings) {
    if(map.containsKey(s.substring(0,1))){
      map.put(s.substring(0,1), map.get(s.substring(0,1)) + s);
    }else{
      map.put(s.substring(0,1),s);
    }
  }
  return map;
}
