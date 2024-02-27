'''
Problem Link: https://www.codingninjas.com/studio/problems/second-largest-element-in-the-array_873375?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTabValue=PROBLEM
'''

from os import *
from sys import *
from collections import *
from math import *

from sys import stdin
import sys

def findSecondLargest(sequenceOfNumbers):
    if len(sequenceOfNumbers) < 2:
        return -1  # Not enough elements in the array

    # Find the unique elements in the array
    unique_elements = list(set(sequenceOfNumbers))

    # If all elements are the same, return -1
    if len(unique_elements) == 1:
        return -1

    # Find the maximum element in the array
    max_element = max(unique_elements)

    # Remove the maximum element from the array
    unique_elements.remove(max_element)

    # Find the maximum element again in the modified array
    second_largest = max(unique_elements)

    return second_largest


    pass

