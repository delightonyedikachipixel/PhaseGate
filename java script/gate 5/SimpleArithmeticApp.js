// get random numbers 
// declare variables 
// no negative numbers as result
// generate my first numbers from 51 to 100
//generate second numbers from 1 to 50
//printwelcome 
// 10 questions must be taken
// generate correct answer
//  ask to subtract the second number from the first number
// 2 trials on each question
// if you fail the number again after 2 attempts move to the next number
//calculate number of passes
// subtract the numbers
// calculate and display number of fail and pass



const prompt = require('prompt-sync')();


let correctCount = 0;
let failCount = 0;
let numberOfAttempts = 2;

console.log("Welcome to Simple Arithmetic App");

for (let count = 0; count < 10; count++) {

    
    let firstNumber = Math.floor(Math.random() * (100 - 51 + 1)) + 51;
    let secondNumber = Math.floor(Math.random() * (50 - 1 + 1)) + 1;

    let correctAnswer = firstNumber - secondNumber;
    let attempts = 0;

    console.log(`\nQuestion ${count + 1}: ${firstNumber} - ${secondNumber} = ?`);

    while (attempts < numberOfAttempts) {

        let userAnswer = Number(prompt("Your answer: "));

        if (userAnswer === correctAnswer) {
            console.log("Correct!");
            correctCount++;
            break;
        } else {
            attempts++;
            console.log("Wrong!");

            if (attempts === numberOfAttempts) {
                console.log("The correct answer is " + correctAnswer);
                failCount++;
            }
        }
    }
}

console.log("\nGame Over!");
console.log("Total Correct:", correctCount);
console.log("Total Failed:", failCount);
