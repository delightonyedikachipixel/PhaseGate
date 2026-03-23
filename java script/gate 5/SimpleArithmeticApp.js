// get random numbers 
// declare variables 
// no negative numbers as result
// generate my first numbers from 51 to 100
//generate second numbers from 1 to 50
//print welcome 
// 10 questions must be taken
// generate correct answer
//  ask to subtract the second number from the first number
// 2 trials on each question
// if you fail the number again after 2 attempts move to the next number
//calculate number of passes
// subtract the numbers
// calculate and display number of fail and pass




let firstNumber = Math.floor(Math.random()*(51-100+1))+5;
let secondNumber = Math.floor(Math.random()*(1-50+1))+5
let correctCount = 0;
let failCount = 0;
let numberOfAttempts = 2;


console.log("Question " + (count + 1) + ": "  + firstNumber[count] + " - " + secondNumber[count] + " = ?");


while (attempts < numberOfAttempts) {
    console.log("Your answer: ");

    if (yourAnswer == correctAnswer) {
        console.log("Correct!");
            correctCount++;
    break;
} 
    else {
        attempts++;
console.log("Wrong!");

    if (attempts == numberOfAttempts) {
        console.log("The correct answer is " + correctAnswer);
            failCount++;
}
console.log("Game over")

console.log("Total Correct: " + correctCount)
console.log("Total Failed: " + failCount);

