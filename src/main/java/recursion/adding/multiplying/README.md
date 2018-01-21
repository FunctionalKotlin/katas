# Summary

**Question:** Can the number `59` be get from the number `1`, by adding `5` or multiplying by `7`?

**Answer:** `59 = 1 x 7 x 7 + 5 + 5`

# Task

Your task is to implement the pure function:

`canReach(number, add, multiply): Boolean`

It must return a boolean value, indicating if it's possible to reach the number `1`, by either adding `add` or multiplying by `multiply`.

You must implement this function using recursion.

If you want to use the provided tests the function must be called `canReach` and must be inside the `recursion.adding.multiplying` package.

## Arguments

* number: the number to reach from `1`.
* add: the number that can be added in order to reach `number`.
* multiply: the number by which you can multiply in order to reach `number`.

## Example

```kotlin
canReach(59, 5, 7) // true
canReach(10, 5, 3) // false
```

## Conditions

* Do not use any loops.

## Solution

<details><summary><strong>Reveal</strong></summary><p>

---
```kotlin
fun canReach(n: Int, add: Int, multiply: Int): Boolean = if (n <= 1) {
    n == 1
} else {
    if (n % multiply == 0 && multiply > 1) {
        canReach(n / multiply, add, multiply) || 
            canReach(n - add, add, multiply)
    } else {
        canReach(n - add, add, multiply)
    }
}
```

</p></details>

---

Copyright © [FunctionalHub.com](http://functionalhub.com) 2018. All rights reserved.