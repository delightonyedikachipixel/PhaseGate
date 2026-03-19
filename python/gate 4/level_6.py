def split_into_odd_and_even(numbers):
    odd_numbers = [number for number in numbers if number % 2 != 0]
    even_numbers = [number for number in numbers if number % 2 == 0]
    return [odd_numbers, even_numbers]



def is_number_palindrome(number):
    original_number = number
    reversed_number = 0

    while number > 0:
        digit = number % 10
        reversed_number = reversed_number * 10 + digit
        number = number // 10

    return original_number == reversed_number


import math

def get_perfect_square_numbers(numbers):
    perfect_squares = []

    for number in numbers:
        if number >= 0:
            square_root = int(math.sqrt(number))
            if square_root * square_root == number:
                perfect_squares.append(number)

    return perfect_squares


import math
def replace_non_perfect_squares(numbers):
    result = []
    for number in numbers:
        if number >= 0:
            square_root = int(math.sqrt(number))
            if square_root * square_root == number:
                result.append(number)  
            else:
                result.append(-1)      
        else:
            result.append(-1)          
    return result

