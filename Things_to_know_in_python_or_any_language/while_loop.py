'''
Problem Link: https://www.codingninjas.com/studio/problems/sum-of-even-odd_624650?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
'''

## Note : For printing multiple values in one line, put them inside print separated by space.
## You can follow this syntax for printing values of two variables val1 and val2 separaetd by space -
## print(val1, " ", val2)
num = int(input())
o = 0
e = 0

while num != 0:
    a = num % 10
    if (a % 2 == 0):
        e += a
    else:
        o += a
    num = num//10
print(e,"",o)