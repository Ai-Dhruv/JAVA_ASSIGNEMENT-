# Assignment 1: Hello World, Variables and Arithmetic

## 1. Experiment Title

Hello World, Variables and Arithmetic Operations in Java.

## 2. Aim

To write Java programs to print text, declare and initialize variables of different data types, perform basic arithmetic operations, and calculate the area and perimeter of a circle using a constant.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

Java is a high-level, object-oriented programming language.

The following concepts are used in this experiment:

1. **Output Statement:** `System.out.println()` is used to display text and values on the console. It prints the output on a new line.
2. **Variables:** Variables are named memory locations used to store data. Java data types used in this experiment:
   - `int` : Stores integer values.
   - `double` : Stores decimal values.
   - `char` : Stores a single character.
   - `String` : Stores a sequence of characters.
3. **Arithmetic Operators:** Java provides arithmetic operators to perform mathematical calculations:
   - `+` : Addition
   - `-` : Subtraction
   - `*` : Multiplication
   - `/` : Division
   - `%` : Modulus (Remainder)
4. **Constant:** The `final` keyword is used to declare a constant whose value cannot be changed after initialization.
5. **Circle Formulas:**
   - Area = PI × radius × radius
   - Perimeter = 2 × PI × radius

## 5. Algorithm / Procedure

### Question 1: Hello World

1. Start the program.
2. Create the `Main` class.
3. Define the `main()` method.
4. Print "Hello World".
5. Print "Welcome to Java" on the next line.
6. Stop the program.

### Question 2: Variables

1. Start the program.
2. Declare an integer variable `roll` and initialize it with 101.
3. Declare a double variable `percentage` and initialize it with 84.5.
4. Declare a character variable `section` and initialize it with 'B'.
5. Declare a String variable `name` and initialize it with "Asha".
6. Print all variable values with their respective labels.
7. Stop the program.

### Question 3: Arithmetic Operators

1. Start the program.
2. Declare two integer variables `a = 17` and `b = 5`.
3. Calculate their sum using the addition operator.
4. Calculate their difference using the subtraction operator.
5. Calculate their product using the multiplication operator.
6. Calculate their quotient using the division operator.
7. Calculate their remainder using the modulus operator.
8. Display all results with appropriate labels.
9. Stop the program.

### Question 4: Constant and Circle Calculation

1. Start the program.
2. Declare a constant `PI` using the `final` keyword and initialize it with 3.14.
3. Declare a double variable `radius` and initialize it with 7.
4. Calculate the area of the circle using PI and radius.
5. Calculate the perimeter of the circle using PI and radius.
6. Display the area and perimeter.
7. Stop the program.

## 6. Program / Queries / Commands

### Question 1: Hello World

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Welcome to Java");
    }
}
```

### Question 2: Variables

```java
public class Main {
    public static void main(String[] args) {
        int roll = 101;
        double percentage = 84.5;
        char section = 'B';
        String name = "Asha";

        System.out.println("Roll: " + roll);
        System.out.println("Percentage: " + percentage);
        System.out.println("Section: " + section);
        System.out.println("Name: " + name);
    }
}
```

### Question 3: Arithmetic Operators

```java
public class Main {
    public static void main(String[] args) {
        int a = 17;
        int b = 5;

        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
        System.out.println("Remainder: " + (a % b));
    }
}
```

### Question 4: Constant and Circle Calculation

```java
public class Main {
    public static void main(String[] args) {
        final double PI = 3.14;
        double radius = 7;

        double area = PI * radius * radius;
        double perimeter = 2 * PI * radius;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
```

## 7. Input

The following values are used in the experiment:

### Question 1:

No input required.

### Question 2:

- Roll = 101
- Percentage = 84.5
- Section = 'B'
- Name = "Asha"

### Question 3:

- a = 17
- b = 5

### Question 4:

- PI = 3.14
- Radius = 7

## 8. Output

### Question 1:

```text
Hello World
Welcome to Java
```

### Question 2:

```text
Roll: 101
Percentage: 84.5
Section: B
Name: Asha
```

### Question 3:

```text
Sum: 22
Difference: 12
Product: 85
Quotient: 3
Remainder: 2
```

### Question 4:

```text
Area: 153.86
Perimeter: 43.96
```

---

**Result:** All four Java programs were successfully written and executed to demonstrate output statements, variables, data types, arithmetic operators, constants, and basic mathematical calculations.