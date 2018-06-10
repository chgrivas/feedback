package com.chgrivas.feedback.core.collections.list

import spock.lang.Specification


class NodeSpec extends Specification {

	def "A node of Integer type can save and return an Integer"() {
		given:
			Integer i = Integer.valueOf(1)
		when:
			Node<Integer> integerNode = new Node<>(i)
		then:
			integerNode.data == 1
	}
}