'''
Problem Link: https://www.codingninjas.com/studio/problems/non-decreasing-array_699920?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTabValue=PROBLEM
'''

from sys import *
from collections import *
from math import *

def isPossible(arr, n):
    count = 0

    for i in range(1, n):
        if arr[i - 1] > arr [i]:
            count += 1
            if count > 1:
                return False
            if i < 2 or arr[i] >= arr [i - 2]:
                arr [i - 1] = arr [i]
            else:
                arr [i] = arr [i - 1]
    return True
    pass
