
/*
Modify and return the given map as follows: if the key "a" has a value, 
set the key "b" to have that same value. In all cases remove the key "c", 
leaving the rest of the map unchanged.

mapShare({"b": "bbb", "c": "ccc", "a": "aaa"}) → {"b": "aaa", "a": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"d": "hi", "c": "meh", "a": "aaa"}) → {"d": "hi", "b": "aaa", "a": "aaa"}
*/

public Map<String, String> mapShare(Map<String, String> map) {
  if(map.containsKey("a")){
    map.put("b", map.get("a"));
  }
  map.remove("c");
  return map;
}
