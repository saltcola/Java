
/*
The "key" array is an array containing the correct answers to an exam, 
like {"a", "a", "b", "b"}. the "answers" array contains a student's answers, 
with "?" representing a question left blank. 
The two arrays are not empty and are the same length. 
Return the score for this array of answers, giving +4 for each correct answer, 
-1 for each incorrect answer, and +0 for each blank answer.

scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16
*/

public int scoreUp(String[] key, String[] answers) {
  int l = key.length;
  int score = 0;
  for(int i = 0; i< l; i++){
    if(answers[i].charAt(0) == key[i].charAt(0)){
      score += 4;
    }else if(answers[i].charAt(0) != '?'){
      score -= 1;
    }
  }
  return score;
}
