

def add(firstNumber, secondNumber):
    return firstNumber + secondNumber

def is_even(number):
    return number % 2 == 0

def square(number):
    return number * number

def celsius_to_fahrenheit(temperature):
    return (temperature * 9/5) + 32

def is_prime(number):
    if number <= 1:
        return False
    for count in range(2, number):
        if number % count == 0:
            return False
    return True

def largest(firstNumber, secondNumber, thirdNumber):
    if firstNumber >= secondNumber and firstNumber >= thirdNumber:
        return firstNumber
    elif secondNumber >= firstNumber and secondNumber >= thirdNumber:
        return secondNumber
    else:
        return thirdNumber

def simple_interest(principal, rate, time):
    return (principal * rate * time) / 100

def multiplication_table(number):
    table = []
    for count in range(1, 11):  
        table.append(count * number)
    return table

def area_of_rectangle(length, width):
    return length * width

def reverse_a_number(number):
    reversed_num = 0
    while number > 0:
        digit = number % 10
        reversed_num = reversed_num * 10 + digit
        number = number // 10
    return reversed_num
