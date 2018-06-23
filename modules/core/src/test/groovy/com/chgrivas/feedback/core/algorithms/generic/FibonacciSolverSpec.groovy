package com.chgrivas.feedback.core.algorithms.generic

import spock.lang.Specification

import java.time.Duration
import java.time.Instant

class FibonacciSolverSpec extends Specification {

  FibonacciSolver fibonacciSolver

  def setup() {
    fibonacciSolver = new FibonacciSolver()
  }

  def "recursive algorith works as expected"() {
    when:
      Instant before = Instant.now()
      def result = fibonacciSolver.getFibonacciRecursively(45)
      Instant after = Instant.now()
    then:
      Duration timeElapsed = Duration.between(before, after);
      println "Finished in ${timeElapsed.toMillis()} millis"
    and:
      result == 1836311903
  }
}
