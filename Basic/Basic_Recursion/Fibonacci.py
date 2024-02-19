'''
https://www.codingninjas.com/studio/problems/print-fibonacci-series_7421617?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
'''

from typing import List

def generateFibonacciNumbers(n: int) -> List[int]:
    # Base case: handle the first two Fibonacci numbers
    yield 0
    if n > 1:
        yield 1

    # Generate Fibonacci numbers using a loop
    a, b = 0, 1
    for _ in range(n - 2):
        a, b = b, a + b
        yield b

