const numbers = [1, 2, 3, 40];
const [a, , , c] = numbers;

console.log(a);
// console.log(b);
console.log(c);

const colors = ["red", "purple"];
// const colors = ["red"]

const [primary, secondary = "blue", third] = colors;

console.log(colors);
console.log(primary);
console.log(secondary);

const coordinates = [
  [10, 20],
  [30, 40]
];
const [[x1, y1], [x2, y2]] = coordinates;

console.log(x1, y1);
console.log(x2, y2);
