package com.chgrivas.feedback.core.algorithms.generic;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciSolver {

  public BigInteger getFibonacciRecursively(BigInteger n) {
    if (BigInteger.ZERO.equals(n) || BigInteger.ONE.equals(n)) {
      return BigInteger.ONE;
    }
    return getFibonacciRecursively(n.subtract(BigInteger.valueOf(1))).add(getFibonacciRecursively(n.subtract(BigInteger.valueOf(2))));
  }

  public BigInteger getFibonacciMemoized(BigInteger n, Map<BigInteger, BigInteger> memo) {

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

  public BigInteger getFibonacciBottomUp(BigInteger n) {

    Map<BigInteger, BigInteger> memo = new HashMap<>();

    memo.put(BigInteger.valueOf(0), BigInteger.ONE);
    memo.put(BigInteger.valueOf(1), BigInteger.ONE);

    if (memo.containsKey(n)) {
      return memo.get(n);
    }

    BigInteger i = BigInteger.valueOf(2);
    while (i.compareTo(n) <= 0) {
      BigInteger before1 = memo.get(i.subtract(BigInteger.valueOf(1)));
      BigInteger before2 = memo.get(i.subtract(BigInteger.valueOf(2)));
      memo.put(i, before1.add(before2));
      i = i.add(BigInteger.valueOf(1));
    }

    return memo.get(n);
  }
}
