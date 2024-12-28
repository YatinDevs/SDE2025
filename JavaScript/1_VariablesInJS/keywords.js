// Keywords In Javascript :

// What is Key Difference in Let , Var and const ?

// 1.  var keyword

/*  
    - var is older version and way of creating variable.
    -  var can be redeclared.
    -  var has function scope.
    -  var is not block scoped.
    -  var is not strict mode.
    -  var is not immutable can be changed.
    -  var is hoisted to top of the function.
*/

// declare variable with let keyword

var firstName = "Yatin";
console.log(firstName);

// Output : Yatin

firstName = "Sachin";

// 2. let and const keyword

/*
    
    - let and const are more strict and newly introduced in ES6.
    - let and const are block scope --> {} - This is Block.
    - const are immutable cannot be change.
    - let and const are not hoisted to top of the function.

*/

// declare variable with let keyword

let pie = 3.14;
pie = 3.15; // can be changed immutable
console.log(pie);
// Output : 3.14

// declare variable with const keyword

const pi = 3.14;
// pi = 3.15;  // cannot be change immutable
console.log(pi);
// Output : 3.14

// ! So Above Interview Question for Let,Var, and Const
/*
  Always Keep this four things in mind about let, var and const 

? 1. scope 

    1. var --> function Scope.
    2. let and const --> block scope --> {} - This is Block.


    

*/

// * var scope --> function scope

/*
var a = 10;
{
  var a = 20; // it can be used outside block as var is function scope and not block scoped
}

console.log(a);

var a = 10;

function x() {
  var a = 20; // it is limited to function declaration only and cannot be used outside.
}
x();

console.log(a);
*/

// * let and const scope -> block scope

// let a = 10;
// {
//   let a = 20;
// }
// console.log(a);

// const a = 10;
// {
//   const a = 20;
// }
// console.log(a);

const a = 10;
function x() {
  let a = 20;
}
x();

console.log(a);

/*


? 2. hoisting.

Hoisting Overview
Hoisting is a JavaScript mechanism where variable, function, or class declarations are 
moved to the top of their scope during the compile phase, before code execution.
This means you can access them before their declaration in the code.

However, only declarations are hoisted. For variables declared with var, they are initialized 
as undefined, but let, const, and class remain uninitialized and in the Temporal Dead Zone
(TDZ) until the code execution reaches their declaration.

  Starting with var

  - scope -> function scope.
  - hoisting -> var is hoisted to top of the function.
  

 ! In Case of Var :

console.log(a); // Output: undefined (hoisted declaration)
var a = 100; // Declaration and initialization
console.log(a); // Output: 100

Behind the Scenes:

javascript
Copy code

var a;
console.log(a); // undefined
a = 100;
console.log(a); // 100


*/

/*

? 3. declaration. 
? 4. initialization.

  
  Summary of Let vs Var vs Const :

  var  : 
     - var can be redeclared
     - var can be reinitialized / reassigned
    

  let  : 
     - let cannot be redeclared
     - let can be  reinitialized / reassigned
    

  const: 
     - const cannot be redeclared
     - const cannot be  reinitialized / reassigned
     
    


*/

// * 1 Redeclaring with var
var x = 10;
var x = 20; // No error

// Reinitializing with var
x = 30; // Works fine

console.log(x); // Output: 30

// * 2  Redeclaring with let
let y = 10;
// let y = 20; // Error: Identifier 'y' has already been declared

// Reinitializing with let
y = 30; // Works fine
console.log(y); // Output: 30

// In a different block scope
{
  let y = 40; // Allowed in block scope
  console.log(y); // Output: 40
}
console.log(y); // Output: 30

// * 3  Redeclaring with const
const z = 10;
// const z = 20; // Error: Identifier 'z' has already been declared

// Reinitializing with const
// z = 30; // Error: Assignment to constant variable

console.log(z); // Output: 10

// Mutable object with const
const obj = { name: "John" };
obj.name = "Doe"; // Allowed: You can modify the contents of an object
console.log(obj); // Output: { name: "Doe" }

// Reassigning the object itself
// obj = { age: 30 }; // Error: Assignment to constant variable
