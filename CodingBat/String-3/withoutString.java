
/*
Given two strings, base and remove, 
return a version of the base string where all instances of the remove string 
have been removed (not case sensitive). 
You may assume that the remove string is length 1 or more. Remove only 
non-overlapping instances, so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
*/

public String withoutString(String base, String remove) {
  int lb = base.length(), lr = remove.length();
  if (lb < lr) return base;
  String s = "";
  for (int i = 0; i < lb; i++){
    if ( Character.toLowerCase(base.charAt(i))==
        Character.toLowerCase(remove.charAt(0)) ){
      if (i + lr <= lb){
        if (base.substring(i,i+lr).toLowerCase().equals(remove.toLowerCase())){
          i = i + lr - 1;
          continue;
        }
      }
    }
    s = s + base.charAt(i);
  }
  return s;
}