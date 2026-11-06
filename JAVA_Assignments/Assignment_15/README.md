# Assignment 15: StringBuilder Methods

**EXPERIMENT NO. 15**

## 1. Experiment Title:
Working with StringBuilder Methods in Java.

## 2. Aim:
To build and modify text using StringBuilder methods such as append(), insert() and deleteCharAt().

## 3. Software / Tools Required:
- Programming Language: Java
- IDE: Visual Studio Code
- JDK (Java Development Kit)
- Operating System: Windows

## 4. Theory:
StringBuilder is a class in Java used to create and modify mutable strings.

Unlike String, StringBuilder allows us to change the content without creating a new object.

Important StringBuilder methods:

- **append():** Adds text or values at the end of the existing string.
- **insert():** Inserts text or values at a specified position.
- **deleteCharAt():** Removes a character from a specified index.
- **length():** Returns the total number of characters.
- **toString():** Converts StringBuilder into a String.

## 5. Algorithm / Procedure:

### TASK 1: Append Text and Find Length
1. Start the program.
2. Create a StringBuilder object with the text "Hello".
3. Use append() to add " World".
4. Print the updated StringBuilder.
5. Use length() to find the total number of characters.
6. Print the length.
7. Stop the program.

### TASK 2: Append Numbers and Remove Last Comma
1. Start the program.
2. Create an empty StringBuilder object.
3. Use a for loop from 1 to 5.
4. Append each number followed by a comma.
5. Use deleteCharAt() to remove the last comma.
6. Print the final result.
7. Stop the program.

### TASK 3: Insert Text at a Specific Position
1. Start the program.
2. Create a StringBuilder object with the text "Java".
3. Use insert() to add "Hello " at index 0.
4. Print the updated StringBuilder.
5. Stop the program.

## 6. Program / Queries / Commands:

### TASK 1: Append Text and Find Length

```java
class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");

        System.out.println(sb);
        System.out.println("Length: " + sb.length());
    }
}
```

### TASK 2: Append Numbers and Remove Last Comma

```java
class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            sb.append(i).append(",");
        }

        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
    }
}
```

### TASK 3: Insert Text at a Specific Position

```java
class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.insert(0, "Hello ");

        System.out.println(sb);
    }
}
```

## 7. Input:
The following values are used in the programs:

- **TASK 1:** Initial text = "Hello", appended text = " World".
- **TASK 2:** Numbers from 1 to 5.
- **TASK 3:** Initial text = "Java", inserted text = "Hello ".

## 8. Output:

### TASK 1:
```text
Hello World
Length: 11
```

### TASK 2:
```text
1,2,3,4,5
```

### TASK 3:
```text
Hello Java
```

## 9. Result:
All three Java programs were successfully executed. StringBuilder methods such as append(), insert(), deleteCharAt() and length() were implemented and understood.