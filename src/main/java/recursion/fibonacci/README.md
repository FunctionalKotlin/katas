<div style="text-align:center">
    <img alt="Fibonacci Spiral" src ="https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Fibonacci_spiral.svg/2000px-Fibonacci_spiral.svg.png" />
</div>

# Summary

**Fibonacci** series is a series of natural numbers where the next number is the sum of the previous two numbers:
 
```
f(n) = f(n-1) + f(n-2)
```

The first two numbers in the **Fibonacci** series are always `1`, `1`.

[Read more about Fibonacci sequence](https://en.wikipedia.org/wiki/Fibonacci_number)


# Task

Your task is to implement the pure function:

`fibonacci(index): Int`

It must return the the **Fibonacci** number inside the position `index`.

You must implement this function using tail-recursion.

If you want to use the provided tests the function must be called `fibonacci` and must be inside the `recursion.fibonacci` package.

## Arguments

* number: the **Fibonacci** number's position.

## Example

```kotlin
(1..12).forEach { print("${fibonacci(it)} ") } // 1 1 2 3 5 8 13 21 34 55 89 144
```

## Conditions

* Do not use any loops.
* You can use helper functions to achieve tail-recursion.

## Solution

<details><summary><strong>Reveal</strong></summary><p>

---
```kotlin
tailrec fun fibonacci(n: Int, a: Int = 1, b: Int = 1): Int =
    if (n > 0) fibonacci(n - 1, b, a + b) else a
```

</p></details>

---

Copyright © [FunctionalHub.com](http://functionalhub.com) 2018. All rights reserved.