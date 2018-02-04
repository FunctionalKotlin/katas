# Task

Your task is to implement an extension function for functions that receive two elements of the same type and return an element of that same type.

`(A, A) -> A`

Like, for example: Int::plus, String::concat, etc.

This extension functions must return a currified version of the function been extended.

If you want to use the provided tests the function must be called `curried` and must be inside the `functions.currying` package.

## Example

```kotlin
fun add(x: Int, y: Int): Int = x + y

val curried = ::add.curried() // (Int) -> (Int) -> Int

curried(1) // (Int) -> Int
curried(1, 2) // 3
```

## Solution

<details><summary><strong>Reveal</strong></summary><p>

---
```kotlin
fun <A> ((A, A) -> A).curried(): (A) -> (A) -> A = {
    a1 -> { a2 -> this(a1, a2) }
}
```

</p></details>

---

Copyright © [FunctionalHub.com](http://functionalhub.com) 2018. All rights reserved.