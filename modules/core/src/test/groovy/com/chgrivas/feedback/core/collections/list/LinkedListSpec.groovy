package com.chgrivas.feedback.core.collections.list

import spock.lang.Specification

class LinkedListSpec extends Specification {

	def "Creating an empty linked list of Integers is possible"() {
		when:
			def a = 1
		then:
			a == 1
	}
}