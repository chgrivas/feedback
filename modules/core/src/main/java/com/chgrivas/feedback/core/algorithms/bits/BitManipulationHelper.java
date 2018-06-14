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

  /**
   * Checks how many bits we need to flip in order
   * to convert a to b.
   *
   * @param a
   * @param b
   */
  public int checkBitFlipToBecomeEqual(int a, int b) {

    int count = 0;
    for (int i = a ^ b; i != 0; i = i >> 1) {
      count += i & 1;
    }
    return count;
  }
}
