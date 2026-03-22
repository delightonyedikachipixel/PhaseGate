function intersection(numbers1, numbers2) {
    let temp = [];
    
    for (let index = 0; index < numbers1.length; index++) {
        for (let position = 0; position < numbers2.length; position++) {
            if (numbers1[index] === numbers2[position]) {
                
                
                let alreadyExists = false;
                for (let counter = 0; counter < temp.length; counter++) {
                    if (temp[counter] === numbers1[index]) {
                        alreadyExists = true;
                        break;
                    }
                }
                
                if (!alreadyExists) {
                    temp.push(numbers1[index]);
                }
                
                break; 
            }
        }
    }
    
    return temp;
}

