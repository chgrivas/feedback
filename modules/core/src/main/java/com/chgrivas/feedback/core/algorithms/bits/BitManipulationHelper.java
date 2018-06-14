package com.chgrivas.feedback.core.algorithms.bits;

/**
 * Contains methods that solve problems using bit manipulation techniques.
 */
public class BitManipulationHelper {

  /**
   * Chacks if a nuber is power of two.
   *
   * @param candidate the number that is being checked
   * @return true if it is a power of two, or false otherwise
   */
  public boolean isPowerOfTwo(Long candidate) {
    return (candidate & (candidate - 1)) == 0;
  }
}
