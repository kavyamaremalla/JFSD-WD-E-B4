const { error } = require("console");
const fs = require("fs"); //import statement for file system library

function display(err, data) {
  //call back function
  if (err) {
    console.log(err.message);
  } else {
    console.log(data);
  }
}

// fs.readFile("file1.txt", "utf-8", (err, data) => {
//   //arrow function as a call back function
//   if (err) {
//     console.log(err.message);
//   } else {
//     fs.readFile("file2.txt", "utf-8", (err, data1) => {
//       if (err) {
//         console.log(err);
//       } else {
//         console.log(data);
//         console.log(data1);
//       }
//     });
//   }
// });

let myPromise = new Promise((myResolve, myReject) => {
  let x = 0;
//producing code
  if (x == 0) {
    myResolve("Ok, x is zero");
  } else {
    myReject("Error, x is not equal to zero, it is " + x);
  }
});

myPromise.then((val) => console.log(val)).catch((error) => console.log(error));

console.log(myPromise);

let promise = new Promise((resolve, reject) => {
  setTimeout(() => console.log("Hey, from time out function"), 3000);  
});

promise.then((val) => console.log(val)).catch((error) => console.log(error)); //consuming code


console.log(promise);
