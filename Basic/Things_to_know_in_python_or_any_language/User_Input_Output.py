'''
Problem Link: https://www.codingninjas.com/studio/problems/find-character-case_58513?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

Problem statement:
Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.

1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet.

Example:
Input: The character is 'a'.
Output: 0

Explanation: The input character is lowercase, so our answer is 0.
'''

# take the input
character = input("Enter a character: ") #in problem leave input as it is ex: input()

#check if character is alphabet or not
if character.isalpha():
    # write the if statement
    if character == character.upper():
        print("1")
    elif character == character.lower():
        print("0")
else:
    print("-1")