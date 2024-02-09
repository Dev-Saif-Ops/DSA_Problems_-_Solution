'''
Problem Link: https://www.codingninjas.com/studio/problems/reverse-bits_2181102?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
'''

def reverseBits(n):
    # Write your code here.

    #first convert the input in bit (it is converted in 0b format)
    n = bin(n)

    #convert 0b into the 32 bit format
    n = n[2:].zfill(32)

    #now revrse the binary and convert it into the decimal
    return int(n[:: -1], 2)
    pass
