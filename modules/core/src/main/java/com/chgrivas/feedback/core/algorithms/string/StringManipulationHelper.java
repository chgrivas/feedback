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
}
