
/*
Given a string, return the sum of the numbers appearing in the string, 
ignoring all other characters. A number is a series of 1 or more digit chars in a row. 
(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. 
Integer.parseInt(string) converts a string to an int.)

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
*/

public int sumNumbers(String str) {
  int sum = 0;
  int l = str.length();
  for ( int i = 0; i < l; i++){
      if(Character.isDigit(str.charAt(i))){
          int digit = 1;
          int start = i;
          while(i+1 < l && Character.isDigit(str.charAt(i+1))){
              digit ++;
              i++;
          }
          String number = str.substring(i-digit+1,i+1);
          int num = Integer.parseInt(number);
          sum += num;
      }

  }
  return sum;
}