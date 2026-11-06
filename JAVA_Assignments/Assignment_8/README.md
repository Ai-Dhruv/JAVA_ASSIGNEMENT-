# EXPERIMENT NO. 8

## 1. Experiment Title:

Matrices: Transpose and Row Sums

## 2. Aim:

To create two-dimensional arrays, access matrix elements using nested loops, calculate row sums and generate the transpose of a matrix.

## 3. Software / Tools Required:

- Programming Language: Java
- IDE: VS Code
- JDK (Java Development Kit)

## 4. Theory:

**Two-Dimensional Array (Matrix):** A two-dimensional array is used to store elements in rows and columns. Each element is accessed using two indexes: row index and column index.

**Nested Loops:** A loop inside another loop is called a nested loop. It is used to access and process each element of a matrix.

**Matrix Transpose:** The transpose of a matrix is obtained by interchanging its rows and columns. The element at position `[i][j]` becomes `[j][i]`.

**Row Sum:** The sum of a row is calculated by adding all elements present in that particular row.

## 5. Algorithm / Procedure:

### TASK 1: Create and Print a Matrix

1. Create a 3 by 4 matrix named `m`.
2. Initialize a variable `num` with value 1.
3. Use nested loops to fill the matrix with values from 1 to 12.
4. Print the matrix row by row.
5. Use a space after each number.

### TASK 2: Find Transpose of a Matrix

1. Create a 3 by 3 matrix with rows 1 2 3, 4 5 6 and 7 8 9.
2. Create another 3 by 3 matrix for storing the transpose.
3. Use nested loops to interchange rows and columns.
4. Store each element at position `[j][i]`.
5. Print the transposed matrix row by row.

### TASK 3: Calculate Row Sums

1. Create a 3 by 3 matrix with rows 1 2 3, 4 5 6 and 7 8 9.
2. Use an outer loop to access each row.
3. Initialize sum to 0 for every row.
4. Use an inner loop to calculate the sum of each row.
5. Print the sum of each row.

## 6. Program / Queries / Commands:

### TASK 1: Create and Print a Matrix

```java
class Main {
    public static void main(String[] args) {
        int[][] m = new int[3][4];
        int num = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = num++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### TASK 2: Find Transpose of a Matrix

```java
class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transpose = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### TASK 3: Calculate Row Sums

```java
class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }

            System.out.println("Row " + (i + 1) + " sum: " + sum);
        }
    }
}
```

## 7. Input:

**TASK 1:**

`3 rows and 4 columns`

**TASK 2:**

`1, 2, 3, 4, 5, 6, 7, 8, 9`

**TASK 3:**

`1, 2, 3, 4, 5, 6, 7, 8, 9`

## 8. Output:

**TASK 1:**

```text
1 2 3 4
5 6 7 8
9 10 11 12
```

**TASK 2:**

```text
1 4 7
2 5 8
3 6 9
```

**TASK 3:**

```text
Row 1 sum: 6
Row 2 sum: 15
Row 3 sum: 24
```

## 9. Result:

Successfully implemented two-dimensional arrays and nested loops in Java to create and print matrices, find the transpose of a matrix and calculate the sum of each row.