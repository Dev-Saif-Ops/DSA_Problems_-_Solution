'''
Problem Link: https://www.codingninjas.com/studio/problems/factorial-numbers-not-greater-than-n_8365435?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
'''

from typing import List
import math

def factorialNumbers(n: int) -> List[int]:
    # Write your code here
    f = []
    i = 1
    while math.factorial(i) <= n:
        f.append(math.factorial(i))
        i += 1
    return f

