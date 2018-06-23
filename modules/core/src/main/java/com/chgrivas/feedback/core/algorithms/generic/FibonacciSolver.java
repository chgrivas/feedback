package com.chgrivas.feedback.core.algorithms.generic;

public class FibonacciSolver {

  int getFibonacciRecursively(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return getFibonacciRecursively(n - 1) + getFibonacciRecursively(n - 2);
  }
}
