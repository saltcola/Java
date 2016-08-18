
/*
Given an array of strings, return a Map<String, Boolean> where each different string is a key 
and value is true only if that string appears 2 or more times in the array.

wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
*/

public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> mapB = new HashMap();
  Map<String, Integer> mapI = new HashMap();
  for (String s:strings) {
    if(mapI.containsKey(s)){
      mapI.put(s, mapI.get(s) +1);
      if(mapI.get(s) ==2){
        mapB.put(s, true);
      }
    }else{
      mapI.put(s,1);
      mapB.put(s,false);
    }
  }
  return mapB;
}

/*

public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> map = new HashMap();
  for (String s:strings) {
    // plan for stored boolean:
    //   false = seen it once
    //   true = seen it twice or more
    if (!map.containsKey(s)) {
      map.put(s, false);
    }
    else if (map.get(s) == false) {  // works without this test
      map.put(s, true);
    }
  }
  return map;
}

*/
