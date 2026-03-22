def flatten(matrix):
    result = []
    for row in range(len(matrix)):
        for column in range(len(matrix[row])):
            result.append(matrix[row][column])
    return result
