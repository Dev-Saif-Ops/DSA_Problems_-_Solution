'''
Problem Link: https://www.codingninjas.com/studio/problems/print-1-to-n_628290?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
'''

from typing import List

def printNos(x: int) -> List[int]:
    # Write your code here
    if x == 0:
        return []
    else:
        ans = printNos(x - 1)
        ans.append(x)
    return ans
    pass
