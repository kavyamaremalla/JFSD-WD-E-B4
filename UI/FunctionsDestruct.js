function sum([a, b]) {
  return a + b;
}

console.log(sum([5, 10]));

function greet({ name, age }) {
  console.log(`Hello, ${name}. You are ${age} years old! `);
}
let person = { name: "David", age: 28 };
greet(person);
