# EXPERIMENT NO. 7

## 1. Experiment Title:

Counting Steps and Complexity

## 2. Aim:

To count the number of steps performed by loops and understand their time complexity using single loops, nested loops and while loops.

## 3. Software / Tools Required:

- Programming Language: Java
- IDE: VS Code
- JDK (Java Development Kit)

## 4. Theory:

**Time Complexity:** Time complexity describes how the running time of an algorithm increases with the size of its input.

**Single Loop:** A single loop executes a fixed number of times. If a loop runs n times, its time complexity is O(n).

**Nested Loops:** A loop inside another loop is called a nested loop. If both loops run n times, the time complexity is O(n²).

**While Loop:** A while loop repeatedly executes statements while a given condition is true. If the value is divided by 2 in every iteration, its time complexity is O(log n).

## 5. Algorithm / Procedure:

### TASK 1: Count Steps Using a Single Loop

1. Initialize a variable `steps` with 0.
2. Use a for loop from 1 to 10.
3. Increase steps by 1 in every iteration.
4. Print Steps: followed by the total number of steps.
5. Write the time complexity as a comment above the loop.

### TASK 2: Count Steps Using Nested Loops

1. Initialize a variable `steps` with 0.
2. Use two nested for loops, both running from 1 to 10.
3. Increase steps by 1 inside the inner loop.
4. Print Steps: followed by the total number of steps.
5. Write the time complexity as a comment above the loops.

### TASK 3: Count Halving Steps

1. Create an integer variable `n` and store 1024.
2. Initialize a variable `steps` with 0.
3. Use a while loop that runs until n becomes 1.
4. Divide n by 2 in every iteration.
5. Increase steps by 1 after every division.
6. Print Halving steps: followed by the total number of steps.
7. Write the time complexity as a comment above the loop.

## 6. Program / Queries / Commands:

### TASK 1: Count Steps Using a Single Loop

```java
class Main {
    public static void main(String[] args) {
        int steps = 0;

        // Time Complexity: O(n)
        for (int i = 1; i <= 10; i++) {
            steps++;
        }

        System.out.println("Steps: " + steps);
    }
}
```

### TASK 2: Count Steps Using Nested Loops

```java
class Main {
    public static void main(String[] args) {
        int steps = 0;

        // Time Complexity: O(n^2)
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                steps++;
            }
        }

        System.out.println("Steps: " + steps);
    }
}
```

### TASK 3: Count Halving Steps

```java
class Main {
    public static void main(String[] args) {
        int n = 1024;
        int steps = 0;

        // Time Complexity: O(log n)
        while (n > 1) {
            n = n / 2;
            steps++;
        }

        System.out.println("Halving steps: " + steps);
    }
}
```

## 7. Input:

**TASK 1:**

`Loop runs from 1 to 10`

**TASK 2:**

`Both loops run from 1 to 10`

**TASK 3:**

`n = 1024`

## 8. Output:

**TASK 1:**

```text
Steps: 10
```

**TASK 2:**

```text
Steps: 100
```

**TASK 3:**

```text
Halving steps: 10
```

## 9. Result:

Successfully implemented loops in Java to count the number of execution steps using single loops, nested loops and while loops, and understood their time complexities.