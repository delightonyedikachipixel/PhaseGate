number = int(input("Enter a number: "))


while number < 0:
    print("Please enter a positive number")
    number = int(input("Enter a number: "))


for count in range(1, 13):
    print(number, "x", count, "=", number * count)
