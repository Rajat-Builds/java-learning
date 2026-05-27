## Chapter 10 — Exception Handling

### What I learned

**Basics**
- What an Exception is — when a program crashes due to something illegal happening
- `try` block — where you write risky code that might cause an error
- `catch` block — where you handle the error and prevent the crash
- `finally` block — always runs whether an error occurs or not, used for cleanup
- Multiple catch blocks — catching different exceptions separately
- General `Exception` catch — fallback for any unexpected error

**Common Built-in Exceptions**
- `ArithmeticException` — dividing a number by zero
- `NumberFormatException` — converting an invalid String to a number
- `ArrayIndexOutOfBoundsException` — accessing an index that doesn't exist in an array

**Advanced**
- `throw` — manually throwing an exception when a condition fails
- `throws` — declaring that a method can throw an exception
- `getMessage()` — getting the error message from an exception
- Custom Exception — creating your own exception by extending `Exception` class

### Key concepts
- Without exception handling, one error crashes the entire program
- Always put specific exceptions before the general Exception catch
- `finally` block runs even if there is no error — useful for closing files or connections
- Use `throw` when you want to trigger an exception yourself based on a condition
- Custom exceptions make your code more readable and meaningful
