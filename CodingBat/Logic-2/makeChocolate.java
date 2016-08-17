
/*
We want make a package of goal kilos of chocolate. 
We have small bars (1 kilo each) and big bars (5 kilos each). 
Return the number of small bars to use, 
assuming we always use big bars before small bars. Return -1 if it can't be done.

makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
*/

public int makeChocolate(int small, int big, int goal) {
  int numB = goal / 5;
  int numS = goal % 5;
  
  if(big >= numB){
    if( small >= numS) return numS;
    return -1;
  }else{
    numS = goal - big * 5;
    if( small >= numS) return numS;
    return -1;
  }
  
  
}