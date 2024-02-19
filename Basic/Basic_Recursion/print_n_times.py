'''
Problem Link: https://www.codingninjas.com/studio/problems/-print-n-times_8380707?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
'''

from  typing import *

def printNtimes(n: int) -> List[str]:
    x = 0
    arr = []
    print_str(arr, x, n)
    return arr

def print_str(st:list, x:int, n:int):
    s = "Coding Ninjas"
    if x == n:
        return st

    x += 1
    st.append(s)
    return print_str(st, x, n)
    pass
