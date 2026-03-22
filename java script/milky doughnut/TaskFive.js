function removeDuplicates(array) {
    let temp = [];
    let uniqueCount = 0;

    for (let current = 0; current < array.length; current++) {
        let found = false;
        for (let checked = 0; checked < uniqueCount; checked++) {
            if (temp[checked] === array[current]) {
                found = true;
                break;
            }
        }
        if (!found) {
            temp[uniqueCount] = array[current];
            uniqueCount++;
        }
    }
    return temp;
}
