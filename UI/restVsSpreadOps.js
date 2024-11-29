const numberOne = [1,2,3] 
const numberTwo = [4,5,6] 

// console.log(['a', 'b', ...numberOne, 7]);//Spread Operator


// console.log(numberOne.concat(numberTwo));


const numberCombined = [...numberOne, ...numberTwo] //Spread Operator
// console.log(numberCombined);

function sum(...args) { //Rest Operator
   for (const element of args) {
    // console.log(element);
    
   } 
}

sum(1,2,3,4)
sum("apple", "b", "c")


const user = {name : "Alexa", age : 28};
// console.log(user);

const updatedUser = {...user, age : 26, location : "India"} //Spread Operator

// console.log(updatedUser);

function add(...numbers) { //Rest Operator
    return numbers.reduce((total , num) => total + num , 0);
}

console.log(add(1,2,3,4,5));

//Combining Rest and Spread Operators
function greet(greeting, ...names) { //Rest
    return `${greeting}! ${names.join(", ")}!`;
}

const people = ["John", "Bob", "Zack", "Ana", "Alice"]
console.log(greet("Hello", ...people)); //Spread
