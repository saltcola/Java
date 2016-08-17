
/*
Given a string, return true if the number of appearances of "is" anywhere in the string 
is equal to the number of appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
*/

public boolean equalIsNot(String str) {
  int l = str.length();
  int ci = 0, cn = 0;
  for ( int i = 0; i+2 <= l ;i++){
    if (str.substring(i,i+2).equals("is")){
      i = i+1;
      ci++;
      continue;
    }
  }
  for ( int i = 0; i+3 <= l ;i++){
        if (str.substring(i,i+3).equals("not")){
      i = i+2;
      cn++;
      continue;
    }
  }
  
  return ci == cn;  
}