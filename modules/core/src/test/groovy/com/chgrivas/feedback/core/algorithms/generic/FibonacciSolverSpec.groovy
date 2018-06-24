package com.chgrivas.feedback.core.algorithms.generic

import spock.lang.Specification

import java.time.Duration
import java.time.Instant

class FibonacciSolverSpec extends Specification {

  FibonacciSolver fibonacciSolver

  def setup() {
    fibonacciSolver = new FibonacciSolver()
  }

  def "recursive algorithm works as expected"() {
    when:
      Instant before = Instant.now()
      def result = fibonacciSolver.getFibonacciRecursively(BigInteger.valueOf(20))
      Instant after = Instant.now()
    then:
      Duration timeElapsed = Duration.between(before, after)
      println "Algorithm finished in ${timeElapsed.toMillis()} millis with result ${result}"
    and:
      result == 10946
  }

  def "memoized recursive algorithm works as expected"() {
    when:
      Instant before = Instant.now()
      def result = fibonacciSolver.getFibonacciMemoized(BigInteger.valueOf(1000), new HashMap<>())
      Instant after = Instant.now()
    then:
      Duration timeElapsed = Duration.between(before, after)
      println "Memoized algorithm finished in ${timeElapsed.toMillis()} millis with result ${result}"
    and:
      result == 70330367711422815821835254877183549770181269836358732742604905087154537118196933579742249494562611733487750449241765991088186363265450223647106012053374121273867339111198139373125598767690091902245245323403501
  }

  def "bottom up algorithm works as expected"() {
    when:
      Instant before = Instant.now()
      def result = fibonacciSolver.getFibonacciBottomUp(BigInteger.valueOf(1000))
      Instant after = Instant.now()
    then:
      Duration timeElapsed = Duration.between(before, after)
      println "Bottom up algorithm finished in ${timeElapsed.toMillis()} millis with result ${result}"
    and:
      result == 70330367711422815821835254877183549770181269836358732742604905087154537118196933579742249494562611733487750449241765991088186363265450223647106012053374121273867339111198139373125598767690091902245245323403501
  }
}
