'''
Problem Link: https://www.codingninjas.com/studio/problems/check-palindrome-recursive_624386?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
'''

def isPalindrome(string: str) -> bool:
    # Base case: if the length of the string is 0 or 1, it is a palindrome
    if len(string) <= 1:
        return True

    # Check if the first and last characters are the same
    if string[0] == string[-1]:
        # Recursively check the substring between the first and last characters
        return isPalindrome(string[1:-1])

    # If the first and last characters are not the same, it's not a palindrome
    return False
