## Chapter 11 — Generics and Lambda Expressions

### What I learned

**Generics**
- Write one class that works with any data type using `<T>`
- Prevents type casting errors at compile time
- Makes code reusable and type safe

**Lambda Expressions**
- Write a single method interface in one line
- Functional Interface — interface with exactly one abstract method
- `() ->` — lambda with no parameters
- `(a, b) ->` — lambda with multiple parameters

**Streams API**
- `.stream()` — start processing a collection as a stream
- `.filter()` — keep only items that match a condition
- `.map()` — transform each item into something else
- `.forEach()` — do something with each item
- `.collect()` — collect stream results back into a list
- Chaining — combine filter + map + collect in one line

### Key concepts
- Generics make your code flexible — one class works for any type
- Lambda expressions make code shorter and more readable
- Lambda only works with Functional Interfaces
- Streams don't modify the original list — they produce a new result
