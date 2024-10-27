/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcodepractice;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the 
 * longest substring without repeating characters.
 *
 * Note: Sliding window!
 * 
 * Example 1:
 *  Input: s = "abcabcbb"
 *  Output: 3
 *  Explanation: The answer is "abc", with the length of 3.
 *
 * @author negra
 */
public class LongestSubstringWithoutRepeatingChars {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> uniqueChars = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            while (uniqueChars.contains(currentChar)) {
                uniqueChars.remove(s.charAt(left));
                left++;
            }

            uniqueChars.add(currentChar);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
