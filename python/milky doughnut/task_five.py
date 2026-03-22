
def remove_duplicates(array):
    temp = []
    for currentNumber in range(len(array)):
        found = False
        for checked in range(len(temp)):
            if temp[checked] == array[currentNumber]:
                found = True
                break
        if not found:
            temp.append(array[currentNumber])
    return temp








