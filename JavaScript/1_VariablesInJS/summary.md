# Keywords in JavaScript

### **Key Difference Between `let`, `var`, and `const`**

#### **1. `var` keyword**

- Older way of creating variables.
- Can be redeclared.
- Has function scope (not block scoped).
- Not strict mode.
- Mutable (can be changed).
- Hoisted to the top of the function.

```javascript
// Declare variable with var keyword
var firstName = "Yatin";
console.log(firstName); // Output: Yatin

firstName = "Sachin"; // Works fine
console.log(firstName); // Output: Sachin
```

#### **2. `let` and `const` keywords**

- Introduced in ES6.
- Block-scoped ({} represents a block).
- `const` is immutable (cannot be changed).
- Not hoisted to the top of the function.

```javascript
// Declare variable with let keyword
let pie = 3.14;
pie = 3.15; // Works fine (mutable)
console.log(pie); // Output: 3.15

// Declare variable with const keyword
const pi = 3.14;
// pi = 3.15;  // Error: Assignment to constant variable
console.log(pi); // Output: 3.14
```

---

### **Scope**

#### **1. `var` Scope: Function Scope**

- `var` is limited to the function it is declared in and is not block-scoped.

```javascript
var a = 10;
{
  var a = 20; // Can be accessed outside the block
}
console.log(a); // Output: 20

function x() {
  var b = 30; // Limited to this function
}
x();
// console.log(b); // Error: b is not defined
```

#### **2. `let` and `const` Scope: Block Scope**

- `let` and `const` are block-scoped.

```javascript
let a = 10;
{
  let a = 20; // Block-scoped
  console.log(a); // Output: 20
}
console.log(a); // Output: 10

const b = 10;
{
  const b = 20; // Block-scoped
  console.log(b); // Output: 20
}
console.log(b); // Output: 10
```

---

### **Hoisting**

#### **Hoisting Overview**

Hoisting is a mechanism where variable, function, or class declarations are moved to the top of their scope during the compile phase, before code execution.

- `var` is hoisted and initialized to `undefined`.
- `let` and `const` are hoisted but remain in the **Temporal Dead Zone (TDZ)**.

#### **1. `var` Hoisting**

```javascript
console.log(a); // Output: undefined (hoisted declaration)
var a = 100;
console.log(a); // Output: 100
```

#### **2. `let` and `const` Hoisting**

```javascript
// console.log(b); // Error: Cannot access 'b' before initialization
let b = 200;

// console.log(c); // Error: Cannot access 'c' before initialization
const c = 300;
```

---

### **Redeclaration and Reinitialization**

#### **1. `var`**

- Can be redeclared and reinitialized.

```javascript
var x = 10;
var x = 20; // Redeclaration allowed
x = 30; // Reinitialization allowed
console.log(x); // Output: 30
```

#### **2. `let`**

- Cannot be redeclared in the same scope but can be reinitialized.

```javascript
let y = 10;
// let y = 20; // Error: Identifier 'y' has already been declared
y = 30; // Reinitialization allowed
console.log(y); // Output: 30
```

#### **3. `const`**

- Cannot be redeclared or reinitialized.

```javascript
const z = 10;
// const z = 20; // Error: Identifier 'z' has already been declared
// z = 30; // Error: Assignment to constant variable
console.log(z); // Output: 10

// Mutable object with const
const obj = { name: "John" };
obj.name = "Doe"; // Allowed: You can modify the contents of an object
console.log(obj); // Output: { name: "Doe" }

// Reassigning the object itself
// obj = { age: 30 }; // Error: Assignment to constant variable
```

---

### **Summary of `let`, `var`, and `const`**

| Feature              | `var`                | `let`                | `const`                |
| -------------------- | -------------------- | -------------------- | ---------------------- |
| **Redeclaration**    | ✅ Yes               | ❌ No                | ❌ No                  |
| **Reinitialization** | ✅ Yes               | ✅ Yes               | ❌ No                  |
| **Scope**            | Function Scope       | Block Scope          | Block Scope            |
| **Hoisted**          | ✅ Yes (initialized) | ✅ Yes (TDZ applies) | ✅ Yes (TDZ applies)   |
| **Mutable**          | ✅ Yes               | ✅ Yes               | ❌ No (except objects) |

---
