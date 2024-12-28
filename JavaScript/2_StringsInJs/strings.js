// String Indexing

let firstNames = "Sablasl";

// S  a  b  l  a  s  1
// 0  1  2  3  4  5  6

console.log(firstNames[0]); // Output : S
console.log(firstNames[2]); // Output : b
console.log(firstNames[firstNames.length - 1]); // Output : 1

// length of string
console.log(firstNames.length); // Output : 7
firstNames = "Sablasl  "; // if we add space it will count it as well in length
console.log(firstNames.length); // Output : 9
