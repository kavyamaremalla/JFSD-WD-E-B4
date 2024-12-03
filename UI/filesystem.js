const { error, log } = require("console");
const fs = require("fs").promises; //import statement for file system library and use .promises for FS if working with a promise

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

fs.readFile("file1.txt", "utf-8")
  .then((data1) => {
    console.log(data1);
    return fs.readFile("file2.txt", "utf-8"); //returning a promise
  })
  .then((data2) => {
    console.log(data2);
    return fs.readFile("file3.txt", "utf-8"); //returning a promise
  })
  .then((data3) => {
    console.log(data3); //returning a promise
  })
  .catch((error) => console.log(error));

async function displayFileContent() {
  try {
    let data1 = await fs.readFile("file1.txt", "utf-8");
    let data2 = await fs.readFile("file2.txt", "utf-8");
    let data3 = await fs.readFile("file3.txt", "utf-8");

    console.log(data1);
    console.log(data2);
    console.log(data3);

  } catch (error) {
    console.log(error);
  }
}


// displayFileContent() //Invoking the function

// try {
//   let data1 =  fs.readFile("file1.txt", "utf-8");
//   let data2 =  fs.readFile("file2.txt", "utf-8");
//   let data3 =  fs.readFile("file3.txt", "utf-8");

//   console.log(data1);
//   console.log(data2);
//   console.log(data3);
// } catch (error) {
//   console.log(error);
// }


// let myPromise = new Promise((myResolve, myReject) => {
//   let x = 0;
// //producing code
//   if (x == 0) {
//     myResolve("Ok, x is zero");
//   } else {
//     myReject("Error, x is not equal to zero, it is " + x);
//   }
// });

// myPromise.then((val) => console.log(val)).catch((error) => console.log(error));

// console.log(myPromise);

// let promise = new Promise((resolve, reject) => {
//   setTimeout(() => console.log("Hey, from time out function"), 3000);
// });

// promise.then((val) => console.log(val)).catch((error) => console.log(error)); //consuming code

// console.log(promise);
