let x = 3;

let y = (100 + 5) * x;

console.log(y);

let a = 12;
a += 5;

console.log(a);

let voteAge = 19 < 18 ? "Too young" : "Old enough";
console.log(voteAge);

let text1 = "B";
let text2 = "A";

console.log(text1 > text2); //alphabetical order

//CONDITIONAL STATEMENTS

if (text1 < text2) {
  console.log("A comes later");
} else if (text1 === text2) {
  console.log("Inputs are equal");
} else {
  console.log("A comes first");
}

let day;

switch (new Date().getDay()) {
  case 0:
    day = "Sunday";
    break;
  case 1:
    day = "Monday";
    break;
  case 2:
    day = "Tuesday";
    break;
  case 3:
    day = "Wednesday";
    break;
  case 4:
    day = "Thursday";
    break;
  case 5:
    day = "Friday";
    break;
  case 6:
    day = "Saturday";
    break;

  default:
    day = "Please check input"
    break;
}

console.log(day);
console.log(new Date().getDay());
