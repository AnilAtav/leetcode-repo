package main.neetCodeIO.TwoPointers;

public class IsPalindrome {
    //Input: s = "A man, a plan, a canal: Panama"
    //Output: true
    //Explanation: "amanaplanacanalpanama" is a palindrome.

    //2 pointer approach, one from start one from end. if both are same check next couple..
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0, end = s.length() - 1;

        while (start <= end) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(end);
            //if and else if makes the pointer jumps if the current char is not a letter.
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                end--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
