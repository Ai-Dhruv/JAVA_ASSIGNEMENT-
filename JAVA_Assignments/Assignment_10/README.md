# EXPERIMENT NO. 10

## 1. Experiment Title:
Switch and ArrayList

## 2. Aim:
To choose a branch using a switch statement and store, access and modify a list of numbers using ArrayList.

## 3. Software / Tools Required:
- Programming Language: Java
- IDE: VS Code
- JDK (Java Development Kit)

## 4. Theory:
**Switch Statement:** A switch statement is used to execute a particular block of code based on the value of a variable.

**ArrayList:** ArrayList is a resizable collection in Java that stores elements dynamically. It provides methods such as:
- `add()` – Adds an element.
- `get()` – Accesses an element.
- `size()` – Returns the number of elements.
- `set()` – Updates an element.
- `remove()` – Removes an element.

## 5. Algorithm / Procedure:

### TASK 1: Switch Statement
1. Create an integer variable `day` and store 3.
2. Use a switch statement.
3. Check the value of day.
4. Print Wednesday if the value is 3.
5. Print Invalid day for any other value.

### TASK 2: Create and Access ArrayList
1. Create an ArrayList of Integer named `list`.
2. Add the values 10, 20, 30 and 40.
3. Print the complete list.
4. Print its size using `size()`.
5. Print the element at index 2 using `get()`.

### TASK 3: Update and Remove Elements
1. Create an ArrayList of Integer named `list`.
2. Add the values 10, 20, 30 and 40.
3. Use `set()` to change the value at index 1 to 25.
4. Use `remove()` to delete the element at index 3.
5. Print the updated list and its size.

## 6. Program / Queries / Commands:

### TASK 1: Switch Statement

```java
class Main {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}
```

### TASK 2: Create and Access ArrayList

```java
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println("Item at index 2: " + list.get(2));
    }
}
```

### TASK 3: Update and Remove Elements

```java
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.set(1, 25);
        list.remove(3);

        System.out.println(list);
        System.out.println("Size: " + list.size());
    }
}
```

## 7. Input:

**TASK 1:**
`day = 3`

**TASK 2:**
`10, 20, 30, 40`

**TASK 3:**
`10, 20, 30, 40`

## 8. Output:

**TASK 1:**
```text
Wednesday
```

**TASK 2:**
```text
[10, 20, 30, 40]
Size: 4
Item at index 2: 30
```

**TASK 3:**
```text
[10, 25, 30]
Size: 3
```

## 9. Result:
Successfully implemented the switch statement and ArrayList operations in Java to select a day, add elements, access elements, update values and remove elements.