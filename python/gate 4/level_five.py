
def get_sorted_prime_numbers(numbers):
    prime_numbers = []
    for number in numbers:
        if number > 1:
            is_prime = True
            for count in range(2, number):
                if number % count == 0:
                    is_prime = False
            if is_prime:
                prime_numbers.append(number)
    
    
    for count in range(len(prime_numbers)):
        for counter in range(count + 1, len(prime_numbers)):
            if prime_numbers[count] > prime_numbers[counter]:
                prime_numbers[count], prime_numbers[counter] = prime_numbers[counter], prime_numbers[count]
    
    return prime_numbers



def replace_negatives_with_zero(numbers):
    result = []
    for number in numbers:
        if number < 0:
            result.append(0)
        else:
            result.append(number)
    return result



def move_zeros_to_end(numbers):
    no_zeros = []
    zero_count = 0
    for number in numbers:
        if number != 0:
            no_zeros.append(number)
        else:
            zero_count += 1
    for count in range(zero_count):
        no_zeros.append(0)
    return no_zeros



def get_duplicate_elements(numbers):
    duplicates = []
    for count in range(len(numbers)):
        for counter in range(count + 1, len(numbers)):
            if numbers[count] == numbers[counter]:
                if numbers[count] not in duplicates:
                    duplicates.append(numbers[count])
    return duplicates


