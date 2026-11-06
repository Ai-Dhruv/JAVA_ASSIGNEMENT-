# Assignment 14: Characters: Counting and Positions

**EXPERIMENT NO. 14**

## 1. Experiment Title:
Counting Characters and Finding Their Positions in Java.

## 2. Aim:
To use the charAt() method in Java to count vowels, count occurrences of a particular character and print each character with its position.

## 3. Software / Tools Required:
- Programming Language: Java
- IDE: Visual Studio Code
- JDK (Java Development Kit)
- Operating System: Windows

## 4. Theory:
A String in Java is a sequence of characters. Java provides different methods to access and process individual characters.

Important concepts:

- **charAt():** Returns the character at a specified index.
- **length():** Returns the total number of characters in a string.
- **for loop:** Used to visit each character of a string.
- **Character Counting:** Counts how many times a particular character appears.
- **Indexing:** Positions in a String start from 0.

## 5. Algorithm / Procedure:

### TASK 1: Count Vowels in a String
1. Start the program.
2. Store "programming" in a String variable named `s`.
3. Initialize a variable `count = 0`.
4. Use a for loop to visit each character.
5. Check whether the character is a vowel (a, e, i, o, u).
6. If it is a vowel, increase count by 1.
7. Print the total number of vowels.
8. Stop the program.

### TASK 2: Count Occurrences of Character 'g'
1. Start the program.
2. Store "programming" in a String variable named `s`.
3. Initialize a variable `count = 0`.
4. Use a for loop to visit each character.
5. Check whether the character is equal to 'g'.
6. If true, increase count by 1.
7. Print the total count of 'g'.
8. Stop the program.

### TASK 3: Print Characters with Their Positions
1. Start the program.
2. Store "hello" in a String variable named `s`.
3. Use a for loop from index 0 to the length of the string.
4. Access each character using charAt().
5. Print the index followed by the character.
6. Stop the program.

## 6. Program / Queries / Commands:

### TASK 1: Count Vowels in a String

```java
class Main {
    public static void main(String[] args) {

        String s = "programming";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Vowels: " + count);
    }
}
```

### TASK 2: Count Occurrences of Character 'g'

```java
class Main {
    public static void main(String[] args) {

        String s = "programming";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'g') {
                count++;
            }
        }

        System.out.println("Count of g: " + count);
    }
}
```

### TASK 3: Print Characters with Their Positions

```java
class Main {
    public static void main(String[] args) {

        String s = "hello";

        for (int i = 0; i < s.length(); i++) {
            System.out.println(i + ": " + s.charAt(i));
        }
    }
}
```

## 7. Input:
The following values are used in the programs:

- **TASK 1:** String = "programming"
- **TASK 2:** String = "programming", Character = 'g'
- **TASK 3:** String = "hello"

## 8. Output:

### TASK 1:
```text
Vowels: 3
```

### TASK 2:
```text
Count of g: 2
```

### TASK 3:
```text
0: h
1: e
2: l
3: l
4: o
```

## 9. Result:
All three Java programs were successfully executed. The charAt() and length() methods were used to count vowels, count occurrences of a character and display characters with their positions.