'''
Problem Link: https://www.codingninjas.com/studio/problems/nth-fibonacci-number_74156?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
'''

from math import *
from collections import *
from sys import *
from os import *

## Read input as specified in the question.
a = 1
b = 1

nTerm = int(input())

if nTerm == 1 or nTerm == 2:
    print(a)
else:
    for i in range (3, nTerm + 1):
        temp = a + b
        b, a = a, temp    
## Print output as specified in the question.
    print(temp)