//! Introduction to variables

// * 1. Variables can store some information
// * 2. we can use that information later
// * 3. we can change that information later
// * 4. we can use different types of variables to store different types of information

// 1. declaration of variable.

var firstName = "Yatin Chaudhari";

// 2. use a above Variable and print it.

console.log(`"first Print"`, firstName); // variables are Case Sensitive.

// 3. now lets change that variable information

firstName = "Siddesh";

console.log(`"second Print"`, firstName);

//! # Rules for Naming a Variable

// ? # 1 . You cannot start with number.

// example :

//  var 1value = 10;  // (invalid)
//  var value1 = 10 ; // (valid)
//  console.log(valu e1);
//  console.log(value1/2);  // division
//  console.log(value1*2);  // Multiply
//  console.log(value1+2);  // addition
//  console.log(value1-2);  // Subtract
//  console.log(value1 ** 2); // 10^2 --> 10 power 2 -> 100
//  console.log(value1 ** 0.5); // 10 root 2 --> 3.

// ? # 2 . You can use only underscore _ or dollar $ Symbol
//  from special Symbol only this are valid rest are all invalid.

//  firstname_ = "abc";  (valid)
//  _firstname = "abc";  (invalid)

//  firstname$ = "absd";  (valid)
//  $firstname = "adaaw"; (invalid)

// ? # 3 . You cannot use Space in between variable declaration.

// first Name = "Yatin"; // Invalid

// Instead we can use valid Snake or Camel Case.

// var first_Name = "abc"; // Snake case writing

// var firtName = "abc"; // Camel case writing

// ? # 4 .  Convention
// start with small letter and use camelCase
