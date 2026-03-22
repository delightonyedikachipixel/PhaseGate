function squares(n) {
    if (n <= 0) return [];
    let result = [];
    for (let count = 1; count <= n; count++) {
        result[count - 1] = count * count;
    }
    return result;
}
