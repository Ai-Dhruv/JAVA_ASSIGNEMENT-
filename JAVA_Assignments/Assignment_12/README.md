# EXPERIMENT NO. 12

## 1. Experiment Title:
Insertion Sort

## 2. Aim:
To sort small arrays using the Insertion Sort algorithm and count how many values are shifted during sorting.

## 3. Software / Tools Required:
- Programming Language: Java
- IDE: VS Code
- JDK (Java Development Kit)

## 4. Theory:
Insertion Sort is a simple sorting algorithm that builds a sorted array one element at a time.

It works by:
- Taking one element from the unsorted part.
- Comparing it with the elements before it.
- Shifting greater elements one position to the right.
- Inserting the selected element at its correct position.

**Time Complexity:**
- Best Case: O(n)
- Average Case: O(n²)
- Worst Case: O(n²)

## 5. Algorithm / Procedure:

### TASK 1: Sort a Small Array
1. Create an integer array containing 7, 3, 5, 1.
2. Start from the second element.
3. Compare the current element with previous elements.
4. Shift greater elements to the right.
5. Insert the current element at its correct position.
6. Print the sorted array.

### TASK 2: Sort Another Array
1. Create an integer array containing 14, 3, 9, 21, 6.
2. Apply the Insertion Sort algorithm.
3. Compare and shift elements where required.
4. Insert each element at its correct position.
5. Print the sorted array.

### TASK 3: Count Shifts
1. Create an integer array containing 6, 5, 4, 3, 2, 1.
2. Initialize a variable `shifts = 0`.
3. Apply Insertion Sort.
4. Increase the shift count whenever an element moves one position to the right.
5. Print the total number of shifts.

## 6. Program / Queries / Commands:

### TASK 1: Sort a Small Array

```java
class Main {
    public static void main(String[] args) {
        int arr[] = {7, 3, 5, 1};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.print("Sorted: [");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
```

### TASK 2: Sort Another Array

```java
class Main {
    public static void main(String[] args) {
        int arr[] = {14, 3, 9, 21, 6};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.print("Sorted: [");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
```

### TASK 3: Count Shifts

```java
class Main {
    public static void main(String[] args) {
        int arr[] = {6, 5, 4, 3, 2, 1};
        int shifts = 0;

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                shifts++;
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("Shifts: " + shifts);
    }
}
```

## 7. Input:

**TASK 1:**
`7, 3, 5, 1`

**TASK 2:**
`14, 3, 9, 21, 6`

**TASK 3:**
`6, 5, 4, 3, 2, 1`

## 8. Output:

**TASK 1:**
```text
Sorted: [1, 3, 5, 7]
```

**TASK 2:**
```text
Sorted: [3, 6, 9, 14, 21]
```

**TASK 3:**
```text
Shifts: 15
```

## 9. Result:
Successfully implemented the Insertion Sort algorithm in Java to sort integer arrays in increasing order and count the number of shifts performed during sorting.