// const user = { name: "Alexa", age: 28 };

// console.log(user.name);

// const {name, age, location} = user;

// console.log(name);
// console.log(age);
// console.log(location);


// const {name : userName, age : userAge, location:userLocation} = user;
// console.log(userName);
// console.log(userAge);
// console.log(userLocation);

const settings = {theme : "dark", fontSize : "38px"};
const { theme, fontSize = "16px"} = settings

console.log(theme);
console.log(fontSize);

const person = {
    firstName : "Charlie",
    address : {
        city : "New York",
        zip : 1000001
    }
}

const {firstName, address : {city, zip}} = person;

console.log(firstName);
console.log(city);
console.log(zip);










