# get random numbers 
# declare variables 
# no negative numbers as result
# generate my first numbers from 51 to 100
#generate second numbers from 1 to 50
#print welcome 
# 10 questions must be taken
# generate correct answer
#  ask to subtract the second number from the first number
# 2 trials on each question
# if you fail the number again after 2 attempts move to the next number
#calculate number of passes
# subtract the numbers


import random

correctCount = 0
failCount = 0
numberOfAttempts = 2

print("Welcome to Simple Arithmetic App")


firstNumber = [random.randint(51, 100) for numbers in range(10)]
secondNumber = [random.randint(1, 50) for numbers in range(10)]


for count in range(10):
    attempts = 0
    correctAnswer = firstNumber[count] - secondNumber[count]

    print(f"\nQuestion {count+1}: {firstNumber[count]} - {secondNumber[count]} = ?")

    while attempts < numberOfAttempts:
        userAnswer = int(input("Your answer: "))

        if userAnswer == correctAnswer:
            print("Correct!")
            correctCount += 1
            break
        else:
            attempts += 1
            print("Wrong!")

            if attempts == numberOfAttempts:
                print(f"The correct answer is {correctAnswer}")
                failCount += 1

print("\nGame Over!")
print(f"Total Correct: {correctCount}")
print(f"Total Failed: {failCount}")
