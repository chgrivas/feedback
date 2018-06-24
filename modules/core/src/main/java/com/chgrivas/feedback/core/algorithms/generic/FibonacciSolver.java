package com.chgrivas.feedback.core.algorithms.generic;

import java.math.BigInteger;
import java.util.Map;

public class FibonacciSolver {

  BigInteger getFibonacciRecursively(BigInteger n) {
    if (BigInteger.ZERO.equals(n) || BigInteger.ONE.equals(n)) {
      return BigInteger.ONE;
    }
    return getFibonacciRecursively(n.subtract(BigInteger.valueOf(1))).add(getFibonacciRecursively(n.subtract(BigInteger.valueOf(2))));
  }

  BigInteger getFibonacciMemoized(BigInteger n, Map<BigInteger, BigInteger> memo) {

    if (memo.containsKey(n)) {
      return memo.get(n);
    }

    BigInteger result;
    if (BigInteger.ZERO.equals(n) || BigInteger.ONE.equals(n)) {
      result = BigInteger.valueOf(1);
    } else {
      result = getFibonacciMemoized(n.subtract(BigInteger.valueOf(1)), memo).add(getFibonacciMemoized(n.subtract(BigInteger.valueOf(2)), memo));
    }
    memo.put(n, result);
    return result;
  }
}
