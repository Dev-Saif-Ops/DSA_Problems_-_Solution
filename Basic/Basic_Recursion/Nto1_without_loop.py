'''
Problem Link: https://www.codingninjas.com/studio/problems/n-to-1-without-loop_8357243?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
'''

from typing import List

def printNos(x: int) -> List[int]:
    # Declaring an empty list.
    ans = []

    # Calling recursive function.
    recursiveFunction(x, ans)

    return ans

def recursiveFunction(x: int, ans: List[int]):
    # Write your code here
    if x == 0:
        return

    # Insert element in the list.
    ans.append(x)

    # Call recursive function.
    recursiveFunction(x - 1, ans)
