# EXPERIMENT NO. 3

## 1. Experiment Title:

Star and Number Patterns

## 2. Aim:

To use nested loops in Java to print different star and number patterns, including a square, right triangle, number triangle and upside-down triangle.

## 3. Software / Tools Required:

- Programming Language: Java
- IDE: VS Code
- JDK (Java Development Kit)

## 4. Theory:

**Loops:** Loops are used to execute a block of code repeatedly until a given condition becomes false.

**Nested Loops:** A loop inside another loop is called a nested loop. In pattern printing, the outer loop controls the rows and the inner loop controls the columns.

**Star Pattern:** Star patterns are created using loops to print stars in different shapes, such as squares and triangles.

**Number Pattern:** Number patterns are created using loops to print numbers in a specific sequence or arrangement.

## 5. Algorithm / Procedure:

### TASK 1: Print Square Pattern of Stars

1. Use two nested for loops.
2. Set the outer loop to run for 4 rows.
3. Set the inner loop to run for 4 columns.
4. Print a star in each iteration of the inner loop.
5. Move to the next line after each row.

### TASK 2: Print Right Triangle of Stars

1. Use two nested for loops.
2. Set the outer loop to run from 1 to 4.
3. Set the inner loop to run from 1 to the current row number.
4. Print one star in each iteration.
5. Move to the next line after each row.

### TASK 3: Print Number Triangle

1. Use two nested for loops.
2. Set the outer loop to run from 1 to 4.
3. Set the inner loop to run from 1 to the current row number.
4. Print the current inner loop number followed by a space.
5. Move to the next line after each row.

### TASK 4: Print Upside-Down Triangle of Stars

1. Use two nested for loops.
2. Set the outer loop to run from 4 to 1.
3. Set the inner loop to run from 1 to the current row number.
4. Print one star in each iteration.
5. Move to the next line after each row.

## 6. Program / Queries / Commands:

### TASK 1: Print Square Pattern of Stars

```java
class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
```

### TASK 2: Print Right Triangle of Stars

```java
class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
```

### TASK 3: Print Number Triangle

```java
class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
```

### TASK 4: Print Upside-Down Triangle of Stars

```java
class Main {
    public static void main(String[] args) {

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
```

## 7. Input:

**TASK 1:**

`Rows = 4, Columns = 4`

**TASK 2:**

`Rows = 4`

**TASK 3:**

`Rows = 4`

**TASK 4:**

`Rows = 4`

## 8. Output:

**TASK 1:**

```text
****
****
****
****
```

**TASK 2:**

```text
*
**
***
****
```

**TASK 3:**

```text
1
1 2
1 2 3
1 2 3 4
```

**TASK 4:**

```text
****
***
**
*
```

## 9. Result:

Successfully implemented nested loops in Java to print different star and number patterns, including a square, right triangle, number triangle and upside-down triangle.