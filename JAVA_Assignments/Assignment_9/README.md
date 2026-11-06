# EXPERIMENT NO. 9

## 1. Experiment Title:

Matrices: Rows and Columns

## 2. Aim:

To visit the rows and columns of a matrix using nested loops, print the first and last rows, calculate the sum of each column and count values greater than 5.

## 3. Software / Tools Required:

- Programming Language: Java
- IDE: VS Code
- JDK (Java Development Kit)

## 4. Theory:

**Two-Dimensional Array (Matrix):** A two-dimensional array is used to store data in rows and columns. Each element is accessed using two indexes: row index and column index.

**Nested Loops:** A loop inside another loop is called a nested loop. It is used to access and process each element of a matrix.

**Column Sum:** The sum of a column is calculated by adding all elements present in that column.

**Counting Elements:** A condition is used to count the elements that satisfy a particular condition, such as values greater than 5.

## 5. Algorithm / Procedure:

### TASK 1: Print First and Last Row

1. Create a 3 by 3 matrix with values 1 to 9.
2. Print First row: followed by the elements of the first row.
3. Use a loop to access the first row.
4. Print Last row: followed by the elements of the last row.
5. Use a loop to access the last row.

### TASK 2: Calculate Column Sums

1. Create a 3 by 3 matrix with rows 1 2 3, 4 5 6 and 7 8 9.
2. Initialize a loop to access each column.
3. Initialize sum to 0 for every column.
4. Use an inner loop to add all elements of the current column.
5. Print the sum of each column.

### TASK 3: Count Values Greater Than 5

1. Create a 3 by 3 matrix with rows 1 2 3, 4 5 6 and 7 8 9.
2. Initialize a variable count to 0.
3. Use nested loops to visit every element.
4. Check whether each element is greater than 5.
5. Increase count by 1 if the condition is true.
6. Print the total count.

## 6. Program / Queries / Commands:

### TASK 1: Print First and Last Row

```java
class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.print("First row: ");
        for (int j = 0; j < 3; j++) {
            System.out.print(arr[0][j] + " ");
        }

        System.out.println();

        System.out.print("Last row: ");
        for (int j = 0; j < 3; j++) {
            System.out.print(arr[2][j] + " ");
        }
    }
}
```

### TASK 2: Calculate Column Sums

```java
class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int j = 0; j < 3; j++) {
            int sum = 0;

            for (int i = 0; i < 3; i++) {
                sum += arr[i][j];
            }

            System.out.println("Column " + (j + 1) + " sum: " + sum);
        }
    }
}
```

### TASK 3: Count Values Greater Than 5

```java
class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > 5) {
                    count++;
                }
            }
        }

        System.out.println("Values greater than 5: " + count);
    }
}
```

## 7. Input:

**TASK 1:**

`1, 2, 3, 4, 5, 6, 7, 8, 9`

**TASK 2:**

`1, 2, 3, 4, 5, 6, 7, 8, 9`

**TASK 3:**

`1, 2, 3, 4, 5, 6, 7, 8, 9`

## 8. Output:

**TASK 1:**

```text
First row: 1 2 3
Last row: 7 8 9
```

**TASK 2:**

```text
Column 1 sum: 12
Column 2 sum: 15
Column 3 sum: 18
```

**TASK 3:**

```text
Values greater than 5: 4
```

## 9. Result:

Successfully implemented two-dimensional arrays and nested loops in Java to print the first and last rows, calculate column sums and count values greater than 5.