package com.chgrivas.feedback.core.algorithms.string

import spock.lang.Specification
import spock.lang.Unroll


class IsUniqueAlgorithSpec extends Specification {

  IsUniqueAlgorithm algorithm = new IsUniqueAlgorithm()

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
}
