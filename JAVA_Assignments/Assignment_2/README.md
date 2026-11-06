# Assignment 2: Decisions and Loops with Numbers

## 1. Experiment Title:
Decisions and Loops with Numbers in Java.

## 2. Aim:
To use `if`, `else if`, `else` statements and loops to make decisions and perform repeated operations with whole numbers.

## 3. Software / Tools Required:
- Programming Language: Java
- IDE: Visual Studio Code
- JDK (Java Development Kit)
- Operating System: Windows

## 4. Theory:
Decision-making statements are used to execute different blocks of code depending on conditions.

- **if-else:** Used to make decisions between two conditions.
- **else-if ladder:** Used to check multiple conditions.
- **Modulus Operator (%):** Returns the remainder after division.
- **for loop:** Used to repeat a block of code a fixed number of times.
- **Factorial:** The product of all positive integers from 1 to a given number.

## 5. Algorithm / Procedure:

### TASK 1: Check Even or Odd
1. Start the program.
2. Declare an integer variable `n` and store 27.
3. Check whether `n % 2 == 0`.
4. If true, print that the number is even.
5. Otherwise, print that the number is odd.
6. Stop the program.

### TASK 2: Find Grade Using Else-If Ladder
1. Start the program.
2. Declare an integer variable `marks` and store 83.
3. Check whether marks are greater than or equal to 90.
4. If true, print Grade A.
5. Otherwise, check whether marks are greater than or equal to 75.
6. If true, print Grade B; otherwise, print Grade C.
7. Stop the program.

### TASK 3: Check Leap Year
1. Start the program.
2. Declare an integer variable `year` and store 2024.
3. Check whether the year is divisible by 400, or divisible by 4 but not by 100.
4. If the condition is true, print Leap year.
5. Otherwise, print Not a leap year.
6. Stop the program.

### TASK 4: Find Factorial Using For Loop
1. Start the program.
2. Initialize `fact = 1`.
3. Use a for loop from 1 to 5.
4. Multiply `fact` by each number.
5. Print the factorial of 5.
6. Stop the program.

## 6. Program / Queries / Commands:

### TASK 1: Check Even or Odd

```java
class Main {
    public static void main(String[] args) {
        int n = 27;

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
}
```

### TASK 2: Find Grade Using Else-If Ladder

```java
class Main {
    public static void main(String[] args) {
        int marks = 83;

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }
}
```

### TASK 3: Check Leap Year

```java
class Main {
    public static void main(String[] args) {
        int year = 2024;

        if (year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
```

### TASK 4: Find Factorial Using For Loop

```java
class Main {
    public static void main(String[] args) {
        int fact = 1;

        for (int i = 1; i <= 5; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of 5 is " + fact);
    }
}
```

## 7. Input:
The following values are used in the programs:

- **TASK 1:** n = 27
- **TASK 2:** marks = 83
- **TASK 3:** year = 2024
- **TASK 4:** Number = 5

## 8. Output:

### TASK 1:
```text
27 is odd
```

### TASK 2:
```text
Grade: B
```

### TASK 3:
```text
Leap year
```

### TASK 4:
```text
Factorial of 5 is 120
```

---

**Result:**

All four Java programs were successfully executed. The use of if-else, else-if ladder, modulus operator, leap year conditions and for loop was implemented and understood.