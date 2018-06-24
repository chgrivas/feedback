package com.chgrivas.feedback.core.collections.builder

import spock.lang.Specification


class MoStringBuilderSpec extends Specification {

  def "Check that appending strings woeks as expected"() {
    given:
      MoStringBuilder moStringBuilder = new MoStringBuilder()
    when:
      moStringBuilder.append("aaa");
      moStringBuilder.append("b");
      moStringBuilder.append("cc");
      def result = moStringBuilder.toString()
    then:
      result == "aaabcc"
  }
}
