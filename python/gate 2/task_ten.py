number = int(input("Enter a number: "))

count = 0
number = abs(number)

if number == 0:
    count = 1
else:
    while number > 0:
        number //= 10
        count += 1

print("Number of digits:", count)
