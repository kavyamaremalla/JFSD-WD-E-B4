let array = [1,2,4,5];

// for (let index = 0; index < array.length; index++) {
//     const element = array[index];
//     console.log(element);
    
// }

// for(let x in array){
//     console.log(array[x]);
    
// }
let text = "";

for (const element of array) {
    console.log(element);
    
}

const car = {
    model : 2015,
    brand : "Tata",
    year : 2024
}
for (const key in car) {
   console.log(`${key} : ${car[key]}`);
   
}

let i = 5;

while (i < 10) {
console.log(i);
    i++;
}

let y = 100
do {
    console.log(y);
    y++;
} while (y < 10);