package com.chgrivas.feedback.core.algorithms.bits

import spock.lang.Specification
import spock.lang.Unroll


class BitManipulationHelperSpec extends Specification {

  BitManipulationHelper bitManipulationHelper

  def setup() {
    bitManipulationHelper = new BitManipulationHelper()
  }

  @Unroll
  def "A power of two is correctly detected"() {
    when:
      def result = bitManipulationHelper.isPowerOfTwo(input)
    then:
      result == expectedResult
    where:
      input   | expectedResult
      128     | true
      23      | false
      9       | false
      0       | true
      1024    | true
      14      | false
      3       | false
      8       | true
  }

  @Unroll
  def "Flipping number of bits get detected as expected"() {
    when:
      def result = bitManipulationHelper.bitSwapRequired1(a, b)
    then:
      result == expectedResult
    where:
      a   |  b  |expectedResult
      1   |  2  | 2
      1   |  3  | 1
      10  | 344 | 4
  }

  @Unroll
  def "Flipping number of bits get detected as expected with another algorithm"() {
    when:
        def result = bitManipulationHelper.bitSwapRequired2(a, b)
    then:
    result == expectedResult
    where:
      a   |  b  |expectedResult
      1   |  2  | 2
      1   |  3  | 1
      10  | 344 | 4
  }

  def "Swapping bits odd and even work as expected"() {
    when:
      def result = bitManipulationHelper.swapOddEvenBits(a)
    then:
      result == expectedResult
    where:
      a   | expectedResult
      1   | 2
      5   | 10
  }
}
