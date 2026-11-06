# Assignment 13: Strings: Methods and Palindromes

**EXPERIMENT NO. 13**

## 1. Experiment Title:
Implementation of String Methods and Palindrome Checking in Java.

## 2. Aim:
To use common String methods in Java to find the length of a string, locate a character, convert a string into uppercase, reverse a word, check palindrome and print substrings.

## 3. Software / Tools Required:
- Programming Language: Java
- IDE: Visual Studio Code
- JDK (Java Development Kit)
- Operating System: Windows

## 4. Theory:
A String in Java is a sequence of characters. Java provides different methods to access and manipulate strings.

Important String methods:

- **length():** Returns the total number of characters in a string.
- **indexOf():** Returns the position of the first occurrence of a character.
- **toUpperCase():** Converts lowercase letters into uppercase.
- **charAt():** Returns the character at a specified index.
- **equals():** Compares two strings.
- **substring():** Extracts a part of a string.
- **Palindrome:** A word that reads the same from both ends.

## 5. Algorithm / Procedure:

### TASK 1: String Methods
1. Start the program.
2. Store "Programming" in a String variable named `s`.
3. Find the length using length().
4. Find the first position of 'g' using indexOf().
5. Convert the string into uppercase using toUpperCase().
6. Print all three results.
7. Stop the program.

### TASK 2: Reverse a Word
1. Start the program.
2. Store "Java" in a String variable named `s`.
3. Initialize an empty String variable named `rev`.
4. Use a for loop from the last index to the first index.
5. Access each character using charAt().
6. Add each character to rev using the + operator.
7. Print the reversed word.
8. Stop the program.

### TASK 3: Check Palindrome
1. Start the program.
2. Store "racecar" in a String variable named `s`.
3. Initialize an empty String variable named `rev`.
4. Reverse the string using a for loop and charAt().
5. Compare the original string with the reversed string using equals().
6. If both are equal, print "is a palindrome".
7. Otherwise, print "is not a palindrome".
8. Stop the program.

### TASK 4: Print All Substrings
1. Start the program.
2. Store "abc" in a String variable named `s`.
3. Use an outer for loop to select the starting index.
4. Use an inner for loop to select the ending index.
5. Extract each substring using substring().
6. Print every substring from shortest to longest for each starting position.
7. Stop the program.

## 6. Program / Queries / Commands:

### TASK 1: String Methods

```java
class Main {
    public static void main(String[] args) {

        String s = "Programming";

        System.out.println("Length: " + s.length());
        System.out.println("Position of g: " + s.indexOf('g'));
        System.out.println("Upper case: " + s.toUpperCase());
    }
}
```

### TASK 2: Reverse a Word

```java
class Main {
    public static void main(String[] args) {

        String s = "Java";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        System.out.println("Reversed: " + rev);
    }
}
```

### TASK 3: Check Palindrome

```java
class Main {
    public static void main(String[] args) {

        String s = "racecar";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        if (s.equals(rev)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}
```

### TASK 4: Print All Substrings

```java
class Main {
    public static void main(String[] args) {

        String s = "abc";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }
}
```

## 7. Input:
The following values are used in the programs:

- **TASK 1:** String = "Programming", Character = 'g'.
- **TASK 2:** String = "Java".
- **TASK 3:** String = "racecar".
- **TASK 4:** String = "abc".

## 8. Output:

### TASK 1:
```text
Length: 11
Position of g: 3
Upper case: PROGRAMMING
```

### TASK 2:
```text
Reversed: avaJ
```

### TASK 3:
```text
racecar is a palindrome
```

### TASK 4:
```text
a
ab
abc
b
bc
c
```

## 9. Result:
All four Java programs were successfully executed. String methods such as length(), indexOf(), toUpperCase(), charAt(), equals() and substring() were implemented. String reversal, palindrome checking and substring operations were also performed successfully.