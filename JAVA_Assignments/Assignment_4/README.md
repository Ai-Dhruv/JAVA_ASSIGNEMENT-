# EXPERIMENT NO. 4

## 1. Experiment Title:

Writing Functions

## 2. Aim:

To create and use user-defined functions in Java with parameters and return values to calculate factorial, combinations and permutations, and find the maximum of two numbers.

## 3. Software / Tools Required:

- Programming Language: Java
- IDE: VS Code
- JDK (Java Development Kit)

## 4. Theory:

**Functions (Methods):** A function is a block of code that performs a specific task. In Java, functions are called methods and are used to make programs reusable and organized.

**Parameters:** Parameters are variables passed to a method to provide input values.

**Return Value:** A return value is the result sent back by a method using the `return` keyword.

**Factorial:** Factorial of a number is the product of all positive integers from 1 to that number. It is represented by `n!`.

**Combination (nCr):** Combination is used to calculate the number of ways to select r objects from n objects. Its formula is:

\[
nCr = \frac{n!}{r!(n-r)!}
\]

**Permutation (nPr):** Permutation is used to calculate the number of ways to arrange r objects from n objects. Its formula is:

\[
nPr = \frac{n!}{(n-r)!}
\]

## 5. Algorithm / Procedure:

### TASK 1: Calculate Combination (nCr)

1. Create a method `fact(int n)` that calculates the factorial using a loop.
2. Create another method `nCr(int n, int r)`.
3. Use the factorial method to calculate nCr.
4. Call `nCr(5, 2)` from the main method.
5. Print the result.

### TASK 2: Calculate Permutation (nPr)

1. Create a method `fact(int n)` that calculates the factorial using a loop.
2. Create another method `nPr(int n, int r)`.
3. Use the factorial method to calculate nPr.
4. Call `nPr(5, 2)` from the main method.
5. Print the result.

### TASK 3: Find Maximum of Two Numbers

1. Create a method `maxOf(int a, int b)`.
2. Compare both numbers using an if-else statement.
3. Return the larger number.
4. Call `maxOf(14, 9)` from the main method.
5. Print the larger value.

## 6. Program / Queries / Commands:

### TASK 1: Calculate Combination (nCr)

```java id="3jv2kw"
class Main {

    static int fact(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    public static void main(String[] args) {
        System.out.println("5C2 = " + nCr(5, 2));
    }
}
```

### TASK 2: Calculate Permutation (nPr)

```java id="8z3p5v"
class Main {

    static int fact(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    static int nPr(int n, int r) {
        return fact(n) / fact(n - r);
    }

    public static void main(String[] args) {
        System.out.println("5P2 = " + nPr(5, 2));
    }
}
```

### TASK 3: Find Maximum of Two Numbers

```java id="9k2m4x"
class Main {

    static int maxOf(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println("Larger: " + maxOf(14, 9));
    }
}
```

## 7. Input:

**TASK 1:**

`n = 5, r = 2`

**TASK 2:**

`n = 5, r = 2`

**TASK 3:**

`a = 14, b = 9`

## 8. Output:

**TASK 1:**

```text
5C2 = 10
```

**TASK 2:**

```text
5P2 = 20
```

**TASK 3:**

```text
Larger: 14
```

## 9. Result:

Successfully implemented user-defined methods in Java using parameters and return values to calculate factorial, combinations, permutations and the maximum of two numbers.