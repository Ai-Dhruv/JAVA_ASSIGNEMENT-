# EXPERIMENT NO. 11

## 1. Experiment Title:
Bubble Sort and Selection Sort

## 2. Aim:
To sort small arrays using Bubble Sort and Selection Sort algorithms and count the number of swaps performed during sorting.

## 3. Software / Tools Required:
- Programming Language: Java
- IDE: VS Code
- JDK (Java Development Kit)

## 4. Theory:
**Bubble Sort:** Bubble Sort is a sorting algorithm that compares adjacent elements and swaps them if they are in the wrong order. This process continues until the array is sorted.

**Selection Sort:** Selection Sort repeatedly finds the smallest element from the unsorted part of the array and places it at the correct position.

**Time Complexity:**
- Bubble Sort: O(n²)
- Selection Sort: O(n²)

## 5. Algorithm / Procedure:

### TASK 1: Bubble Sort
1. Create an integer array containing 5, 1, 4, 2, 8.
2. Compare adjacent elements.
3. Swap elements if the left element is greater than the right element.
4. Repeat the process until the array is sorted.
5. Print the sorted array.

### TASK 2: Selection Sort
1. Create an integer array containing 64, 25, 12, 22, 11.
2. Find the smallest element in the unsorted part.
3. Swap it with the first element of the unsorted part.
4. Repeat until the complete array is sorted.
5. Print the sorted array.

### TASK 3: Count Swaps Using Bubble Sort
1. Create an integer array containing 5, 1, 4, 2, 8.
2. Initialize a variable `swaps = 0`.
3. Compare adjacent elements.
4. Whenever two elements are swapped, increase the swap count by 1.
5. Print the total number of swaps.

## 6. Program / Queries / Commands:

### TASK 1: Bubble Sort

```java
class Main {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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

### TASK 2: Selection Sort

```java
class Main {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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

### TASK 3: Count Swaps Using Bubble Sort

```java
class Main {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};
        int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                }
            }
        }

        System.out.println("Swaps: " + swaps);
    }
}
```

## 7. Input:

**TASK 1:**
`5, 1, 4, 2, 8`

**TASK 2:**
`64, 25, 12, 22, 11`

**TASK 3:**
`5, 1, 4, 2, 8`

## 8. Output:

**TASK 1:**
```text
Sorted: [1, 2, 4, 5, 8]
```

**TASK 2:**
```text
Sorted: [11, 12, 22, 25, 64]
```

**TASK 3:**
```text
Swaps: 4
```

## 9. Result:
Successfully implemented Bubble Sort and Selection Sort algorithms in Java to sort integer arrays in increasing order and count the swaps performed during Bubble Sort.