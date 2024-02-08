'''
Problem Link: https://www.codingninjas.com/studio/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
'''

def countDigits(n: int) -> int:
    cnt = 0
    for digit_str in str(n):
        digit = int(digit_str)
        if digit != 0 and n % digit == 0:
            cnt += 1
    return cnt