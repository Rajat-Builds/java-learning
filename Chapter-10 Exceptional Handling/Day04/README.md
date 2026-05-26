## Chapter 10 — Exception Handling

### What I learned

- What an Exception is — when a program crashes due to something illegal happening
- `try` block — where you write risky code that might cause an error
- `catch` block — where you handle the error and prevent the crash
- `finally` block — always runs whether an error occurs or not, used for cleanup
- Multiple catch blocks — catching different exceptions separately
- General `Exception` catch — fallback for any unexpected error

### Common Exceptions
- `ArithmeticException` — dividing a number by zero
- `NumberFormatException` — converting an invalid String to a number
- `ArrayIndexOutOfBoundsException` — accessing an index that doesn't exist in an array

### Key concepts
- Without exception handling, one error crashes the entire program
- Always put specific exceptions before the general Exception catch
- `finally` block runs even if there is no error — useful for closing files or connections
- Exception handling makes your program reliable and user friendly
