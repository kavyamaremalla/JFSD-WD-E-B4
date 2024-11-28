// const cars = ["Tata", "kia", "BMW"]

// cars[0] = "Suzuki";
// console.log(cars[0]);

const fruits = new Array("kiwi", "apple", "banana", "guava");

// console.log(fruits.length);
// console.log(fruits);
// console.log(fruits.sort());
// console.log(fruits.forEach());//callback

// function display(val) {
//     console.log(val);

// }

// fruits.forEach(display)

fruits.forEach((val) => console.log(val));

const numbers = [46, 78, 98, 32, 12, 11, 5];

console.log(
  numbers.sort(function (a, b) {
    return a - b;
  })
);

// console.log(
//     numbers.sort(function (a, b) {
//       return b-a;
//     })
//   );

console.log(numbers.sort((a,b) =>b-a));

// console.log(fruits);

// console.log(typeof fruits);
// console.log(fruits instanceof Array);

// let stringVersion = fruits.toString();
// console.log(stringVersion);

// console.log(typeof stringVersion);
// console.log(stringVersion instanceof Array);
// console.log(stringVersion instanceof String);
