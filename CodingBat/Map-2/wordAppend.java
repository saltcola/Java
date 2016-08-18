
/*
Loop over the given array of strings to build a result string like this: 
when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. 
Return the empty string no string appears a 2nd time.

wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "", "a"]) → "a"
wordAppend([]) → ""
*/

public String wordAppend(String[] strings) {
  String result = "";
  Map<String, Integer> map = new HashMap();
  for (String s:strings) {
    if(map.containsKey(s)){
      map.put(s, map.get(s) +1);
      if(map.get(s)%2 == 0){
        result = result + s;
      }
    }else{
      map.put(s,1);
    }
  }
  return result;
}
