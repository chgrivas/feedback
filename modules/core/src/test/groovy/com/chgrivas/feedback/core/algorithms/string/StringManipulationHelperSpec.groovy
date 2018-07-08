package com.chgrivas.feedback.core.algorithms.string

import spock.lang.Specification
import spock.lang.Unroll


class StringManipulationHelperSpec extends Specification {

  StringManipulationHelper algorithm = new StringManipulationHelper()

  @Unroll
  def "The uniqueness of the characters is detected as expected"() {
    when:
      def result = algorithm.isUnique(input)
    then:
      result == expectedResult
    where:
      input      | expectedResult
      "sdfg"     | true
      "sdffffg"  | false
      ""         | true
      "ere"      | false
  }

  def "check compressing a string that gets smaller takes place corerctly"() {
    when:
      def result = algorithm.compress("aaaaasdddssssssss")
    then:
      result == "a5s1d3s8"
  }

  def "check compressing a string that is bigger returns the original"() {
    when:
      def result = algorithm.compress("asdd")
    then:
      result == "asdd"
  }

  def "check compressing a string that is of same length returns the original"() {
    when:
      def result = algorithm.compress("aassdd")
    then:
      result == "aassdd"
  }

  def "Rotations are detected correctly"() {
    when:
      def result = algorithm.isRotation("welcome", "comewel")
    then:
      result
  }

  def "non - Rotations are detected correctly"() {
    when:
      def result = algorithm.isRotation("welcoee", "comewel")
    then:
      !result
  }

  def "Min deletions to anagram works as expected"() {
    when:
      def result = algorithm.findMinDiffForAnagram("aaas", "abs")
    then:
      result == 3
  }

  def "Duplicates are detected as expected"() {
    when:
      def result = algorithm.printDuplicateCharacters("aaaasdas");
    then:
      true
  }

  def "Reversing iteratively works as expected"() {
    when:
      def result = algorithm.reverseIteratively("Hello")
    then:
      result == "olleH"
  }

  def "Reversing recursively works as expected"() {
    when:
      def result = algorithm.reverseRecursively("Hello")
    then:
      result == "olleH"
  }

  def "Limiting a string to 2 chars completes as expected"() {
    when:
      def result = algorithm.limitConsequtiveCharacters("Hello", 1)
    then:
      result == "Helo"
  }

  def "Limiting a string to 0 chars completes as expected"() {
    when:
      def result = algorithm.limitConsequtiveCharacters("asdasd", 0)
    then:
      result == ""
  }

  def "Limiting a bigger string to 2 chars completes as expected"() {
    when:
      def result = algorithm.limitConsequtiveCharacters("mississsssippppi", 2)
    then:
      result == "mississippi"
  }
}
