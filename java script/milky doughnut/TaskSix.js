function flatten(matrix) {
    let result = [];
    let index = 0;
    for (let row = 0; row < matrix.length; row++) {
        for (let column = 0; column < matrix[row].length; column++) {
            result[index] = matrix[row][column];
            index++;
        }
    }
    return result;
}
