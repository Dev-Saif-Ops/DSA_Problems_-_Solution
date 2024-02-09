'''
Problem Link: https://www.codingninjas.com/studio/problems/palindrome-number_624662?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=DISCUSS
'''

n=int(input())  
# taking n as a input 
## write your code !!
if str(n)[::-1] == str(n):
    print("true")
else:
    print("false")

#str(n) converts the integer n to a string.
#[::-1] is used to reverse the string.
#The reversed string is then compared with the original string to check if it is a palindrome.
