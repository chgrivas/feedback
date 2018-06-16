package com.chgrivas.feedback.core.algorithms.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class StringManipulationHelper {

  /**
   * Checks if all the characters in a string appear just once.
   *
   * @param input
   * @return
   */
  public boolean isUnique(String input) {
    Map<Character, Boolean> appearanceMap = new HashMap<>();

    for (int i = 0; i < input.length(); i++) {

      char c = input.charAt(i);
      if (appearanceMap.get(c) != null) {
        return false;
      }
      appearanceMap.put(c, true);
    }
    return true;
  }

  /**
   * Basic string compression.
   *
   * @param input
   * @return
   */
  public String compress(String input) {
    StringBuilder compressed = new StringBuilder();

    int consequtive = 0;
    for (int i = 0; i < input.length(); i++) {
      consequtive++;

      if (i + 1 >= input.length() || input.charAt(i + 1) != input.charAt(i)) {
        compressed.append(input.charAt(i));
        compressed.append(consequtive);
        consequtive = 0;
      }
    }

    return compressed.length() < input.length() ? compressed.toString() : input;
  }

  /**
   * Checks if s1 is a rotation fo s2 with one call to isSubstring.
   *
   * @param s1
   * @param s2
   * @return
   */
  public boolean isRotation(String s1, String s2) {
      int len = s1.length();

      if (len == s2.length() && len> 8) {
        String s1s1 = s1 + s1;
        return isSubstring(s1s1, s2);
      }
      return false;
  }

  private boolean isSubstring(String s1, String s2) {
    return s1.contains(s2);
  }
}
