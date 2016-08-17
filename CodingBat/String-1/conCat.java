
/*
Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
*/

public String conCat(String a, String b) {
  int lA = a.length(), lB = b.length();
  if (lA == 0 || lB == 0) return a+b;
  if (a.substring(lA-1).equals(b.substring(0,1))) return a + b.substring(1);
  return a + b;
}
