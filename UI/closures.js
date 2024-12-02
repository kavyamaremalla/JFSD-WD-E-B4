// let counter = 0; //global

// function sub() {
//     counter -=1;
// }
// add();
// add();
// add();
// sub()

const add = function () {
    let counter = 0; //global to plus and local to add function is closure
    function plus() {
        counter +=1;
    }
    plus();
    counter += 1;
    return counter;
} () 

console.log(add);
// console.log(add());
// console.log(add());

const sum = (function () {
    let counter = 0;
    return counter;
}) (); //Self invoking function

console.log(sum);

