# EXPERIMENT NO. 6

## 1. Experiment Title:

Arrays: Reverse and Duplicates

## 2. Aim:

To print an array in reverse order, find the smallest element and its index, and check an array for duplicate values using loops.

## 3. Software / Tools Required:

- Programming Language: Java
- IDE: VS Code
- JDK (Java Development Kit)

## 4. Theory:

**Array:** An array is a collection of elements of the same data type stored in a fixed-size structure. Each element is accessed using its index.

**Reverse Traversal:** Reverse traversal means accessing array elements from the last index to the first index using a loop.

**Smallest Element:** The smallest element in an array can be found by comparing each element with the current minimum value.

**Duplicate Elements:** Duplicate elements are values that appear more than once in an array. Nested loops can be used to identify repeated values.

## 5. Algorithm / Procedure:

### TASK 1: Print Array in Reverse Order

1. Create an integer array with values 10, 20, 30, 40 and 50.
2. Use a for loop starting from the last index.
3. Decrease the index in every iteration.
4. Print each element on a separate line.

### TASK 2: Find Smallest Element and Its Index

1. Create an integer array with values 2, 5, 1, 8, 3 and 4.
2. Initialize the smallest value with the first array element.
3. Initialize an index variable with 0.
4. Traverse the array using a loop.
5. Compare each element with the smallest value.
6. Update the smallest value and its index if a smaller element is found.
7. Print the smallest value and its index.

### TASK 3: Find Repeated Value

1. Create an integer array with values 4, 9, 2, 9 and 7.
2. Use two nested loops to compare array elements.
3. Check whether two elements are equal at different indexes.
4. If a repeated value is found, print it.
5. Otherwise, print No repeated value.

## 6. Program / Queries / Commands:

### TASK 1: Print Array in Reverse Order

```java
class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
```

### TASK 2: Find Smallest Element and Its Index

```java
class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3, 4};

        int smallest = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                index = i;
            }
        }

        System.out.println("Smallest: " + smallest + " at index " + index);
    }
}
```

### TASK 3: Find Repeated Value

```java
class Main {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 9, 7};

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Repeated value: " + arr[i]);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No repeated value");
        }
    }
}
```

## 7. Input:

**TASK 1:**

`10, 20, 30, 40, 50`

**TASK 2:**

`2, 5, 1, 8, 3, 4`

**TASK 3:**

`4, 9, 2, 9, 7`

## 8. Output:

**TASK 1:**

```text
50
40
30
20
10
```

**TASK 2:**

```text
Smallest: 1 at index 2
```

**TASK 3:**

```text
Repeated value: 9
```

## 9. Result:

Successfully implemented array operations in Java to print elements in reverse order, find the smallest element with its index and identify repeated values using nested loops.