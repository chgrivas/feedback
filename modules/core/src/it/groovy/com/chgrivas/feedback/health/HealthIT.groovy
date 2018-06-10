package com.chgrivas.feedback.health

import spock.lang.Specification


class HealthIT extends Specification {

  def "App is up and running"() {
    when:
      def a = 1
    then:
      a == 2
  }
}
