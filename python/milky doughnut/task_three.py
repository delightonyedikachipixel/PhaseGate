def squares(n):
    if n <= 0:
        return []
    result = []
    for count in range(1, n + 1):
        result.append(count * count)
    return result
