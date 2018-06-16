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
}
