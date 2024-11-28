let result = function multiply(p1, p2) {
  return p1 * p2;
};

console.log(result(4, 3));

function sum(p1, p2) {
  return p1 + p2;
}

console.log(sum(1, 2));
console.log(sum());

let person =  {
    firstName : "John",
    surName : "Doe",
    age : 35,
    isMarried : true,
    company : {
        companyName : "TCS",
        salary : 100000,
        experienced : true
    },
     fullName : function () {
        return this.firstName + " " + this.surName;
    },
}

console.log(person.firstName + " " + person.surName);
console.log(person.fullName());
console.log(person.company.experienced);

