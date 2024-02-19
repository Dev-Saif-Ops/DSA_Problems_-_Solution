'''
Problem Link: https://www.codingninjas.com/studio/problems/rotate-array_1230543?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTabValue=PROBLEM
'''

def rotateArray(arr: list, k: int) -> list:
    # Write your code here.
    n = len(arr)

    # Create a 'rotatedArr' of size 'n'.
    rotatedArr = [0] * n

    # Now store ith value (0 <= i <= n-1) of 'arr' at ((i - k + n)%n)th position in 'rotatedArr'.
    for i in range(n):
        rotatedArr[(i - k + n)%n] = arr[i]

    # Return the rotatedArr.
    return rotatedArr
    pass
