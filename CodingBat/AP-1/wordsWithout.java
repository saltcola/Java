
/*
Given an array of strings, 
return a new array without the strings that are equal to the target string. 
One approach is to count the occurrences of the target string, 
make a new array of the correct length, and then copy over the correct strings.

wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
*/

public String[] wordsWithout(String[] words, String target) {
  int count = 0;
  String s = "";
  for(int i = 0; i < words.length; i++){
    if(!words[i].equals(target)){
      s = s + words[i]+ " ";
    }
  }
  
  String[] a = s.split(" ");
  return a;
}
