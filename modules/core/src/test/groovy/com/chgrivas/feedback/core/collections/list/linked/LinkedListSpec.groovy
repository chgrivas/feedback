package com.chgrivas.feedback.core.collections.list.linked

import spock.lang.Specification


class LinkedListSpec extends Specification {

	def "An empty linked list has null first element"() {
		when:
			def linkedList = new LinkedList()
		then:
			linkedList.getFirst() == null
	}

	def "An empty linked list has null last element"() {
		when:
			def linkedList = new LinkedList()
		then:
			linkedList.getLast() == null
	}

	def "A linked list can accept one element"() {
		given:
			LinkedList<Integer> linkedList = new LinkedList<>()
		when:
			linkedList.add(1)
		then:
			linkedList.getFirst() == linkedList.getLast()
	}

	def "Adding two elements in order make them first and last"() {
		given:
			LinkedList<Integer> linkedList = new LinkedList<>()
		when:
			linkedList.add(1)
			linkedList.add(2)
		then: "Last and first are no more the same"
			linkedList.getFirst() != linkedList.getLast()
		and: "Their values are as expected"
			linkedList.getFirst() == 1
			linkedList.getLast() == 2
	}
}