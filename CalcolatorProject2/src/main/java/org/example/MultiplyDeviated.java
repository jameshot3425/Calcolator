package org.example;

public class MultiplyDeviated {


      public static long multiplyFull(int x, int y) {
            return (long)x * (long)y;
      }

      public static int divideExact(int x, int y) {
            int q = x / y;
            if ((x & y & q) >= 0) {
                  return q;
            }
            throw new ArithmeticException("integer overflow");
      }

}
