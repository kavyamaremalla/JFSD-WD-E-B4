function display(val) { //call back function
    console.log(val);    
}

function add(a, b, param) {
    let sum = a + b; //logic
    param(sum); 
}

function show() {
    console.log("Welcome");
    
}

setTimeout(function () { //anonymous function
    show()
}, 3000)

setTimeout(() => display("JS Async Programming"), 0) //arrrow function as a callback function

add(5, 6, display) // calling the callback function