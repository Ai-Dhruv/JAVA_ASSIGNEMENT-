# EXPERIMENT NO. 5

## 1. Experiment Title:

Arrays: Traversal and Counting

## 2. Aim:

To create an array, access its elements using loops, calculate the sum and largest value, and count elements greater than a given number.

## 3. Software / Tools Required:

- Programming Language: Java
- IDE: VS Code
- JDK (Java Development Kit)

## 4. Theory:

**Array:** An array is a collection of elements of the same data type stored in a fixed-size structure. Each element is accessed using an index starting from 0.

**Array Traversal:** Array traversal means visiting each element of an array using a loop.

**Sum of Array:** The sum of an array is calculated by adding all its elements.

**Largest Element:** The largest element can be found by comparing each element with the current maximum value.

**Counting Elements:** A condition is used to count the number of elements that satisfy a particular condition, such as values greater than 10.

## 5. Algorithm / Procedure:

### TASK 1: Print Array Elements with Index

1. Create an integer array named `arr` with values 3, 4 and 5.
2. Use a for loop to traverse the array.
3. Use `arr.length` to determine the size of the array.
4. Print each element with its index.

### TASK 2: Find Sum and Largest Element

1. Create an integer array with values 12, 45, 7, 33 and 21.
2. Initialize `sum` with 0.
3. Initialize `largest` with the first array element.
4. Traverse the array using a loop.
5. Add each element to sum.
6. Compare each element with largest and update it if necessary.
7. Print the sum and largest value.

### TASK 3: Count Values Greater Than 10

1. Create an integer array with values 5, 12, 2, 14 and 7.
2. Initialize a variable `count` with 0.
3. Traverse the array using a for loop.
4. Check whether each element is greater than 10.
5. Increase count by 1 if the condition is true.
6. Print the total count.

## 6. Program / Queries / Commands:

### TASK 1: Print Array Elements with Index

```java
class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }
}
```

### TASK 2: Find Sum and Largest Element

```java
class Main {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 33, 21};

        int sum = 0;
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Largest: " + largest);
    }
}
```

### TASK 3: Count Values Greater Than 10

```java
class Main {
    public static void main(String[] args) {
        int[] arr = {5, 12, 2, 14, 7};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                count++;
            }
        }

        System.out.println("Count greater than 10: " + count);
    }
}
```

## 7. Input:

**TASK 1:**

`3, 4, 5`

**TASK 2:**

`12, 45, 7, 33, 21`

**TASK 3:**

`5, 12, 2, 14, 7`

## 8. Output:

**TASK 1:**

```text
Index 0: 3
Index 1: 4
Index 2: 5
```

**TASK 2:**

```text
Sum: 118
Largest: 45
```

**TASK 3:**

```text
Count greater than 10: 2
```

## 9. Result:

Successfully implemented array traversal and counting operations in Java to access elements using indexes, calculate the sum and largest value, and count elements greater than 10.