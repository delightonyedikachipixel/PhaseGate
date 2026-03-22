def intersection(numbers1, numbers2):
    temp = []
    
    for index in range(len(numbers1)):
        for position in range(len(numbers2)):
            if numbers1[index] == numbers2[position]:
                
                
                already_exists = False
                for counter in range(len(temp)):
                    if temp[counter] == numbers1[index]:
                        already_exists = True
                        break
                
                if not already_exists:
                    temp.append(numbers1[index])
                
                break  
    
    return temp



