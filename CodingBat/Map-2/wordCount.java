
/*
The classic word-count algorithm: given an array of strings, 
return a Map<String, Integer> with a key for each different string, 
with the value the number of times that string appears in the array.

wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
*/

public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for (String s:strings) {
    if(map.containsKey(s)){
      map.put(s, map.get(s) +1);
    }else{
      map.put(s,1);
    }
  }
  return map;
}
