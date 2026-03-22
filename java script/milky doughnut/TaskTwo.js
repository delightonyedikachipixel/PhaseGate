function linearSearch(numbers, target) {
    for (let index = 0; index < numbers.length; index++) {
        if (numbers[index] === target) {
            return index;
        }
    }
    return -1;
}

