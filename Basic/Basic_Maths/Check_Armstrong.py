'''
Problem Link: https://www.codingninjas.com/studio/problems/check-armstrong_589?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
'''

from os import *
from sys import *
from collections import *
from math import *

def ArmstrongNumber(n):
    originalno = n
    count = 0
    temp = n
    while temp != 0:
        count += 1
        temp //= 10
    sumofpower = 0
    while n != 0:
        digit = n % 10
        sumofpower += pow(digit, count)
        n //= 10
    return sumofpower == originalno




if __name__ == "__main__":
    n = int(input())
    if ArmstrongNumber(n):
        print("true")
    else:
        print("false")