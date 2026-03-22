def array_equal(a, b):
  
    if len(a) != len(b):
        return False

   
    for index in range(len(a)):
        if a[index] != b[index]:
            return False

    return True
