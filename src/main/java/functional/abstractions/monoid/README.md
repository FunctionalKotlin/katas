# Task

Your task is to implement a monoid for the `Try` type.

For that, you should create the method `plus`.

If you want to use the provided tests this method must be called `plus` and must be inside the `functional.abstractions.monoid` package.

## Params

- `aTry`: a `Try` of the same type.
- `f`: a function that takes two `A` and return a `B`

## Example

```kotlin
Try { "hello" }.plus(Try { " hi" }) {
    a1, a2 -> a1 + a2
} // Success("hello hi")

Try { 3 }.plus(Try { " hi".toInt() }) {
    a1, a2 -> a1 + a2
} // Failure(NumberFormatException)
```

## Solution

<details><summary><strong>Reveal</strong></summary><p>

---
```kotlin
fun <A, B> Try<A>.plus(aTry: Try<A>, f: (A, A) -> B): Try<B> =
    fold(
        { Failure(it) },
        { value -> aTry.fold(
            { Failure(it) },
            { Success(f(value, it)) })})
```

</p></details>

---

Copyright © [FunctionalHub.com](http://functionalhub.com) 2018. All rights reserved.