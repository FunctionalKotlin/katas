# Task

Your task is to implement an applicative for the `Try` type.

For that, you should create the methods:

- `apply`: a function that receives a `Try<(A) -> B>` and returns a `Try<B>`.
- `map`: and infix function that allows to `map` a function `(A) -> B` into a `Try<A>` to get a `Try<B>`.
- `ap`: and infix function that allow to apply a `Try<(A) -> B>` into a `Try<A>` to get a `Try<B>`.

If you want to use the provided tests these methods must be called as they are listed and must be inside the `functional.abstractions.applicative` package.

## Example

```kotlin
data class Class(val a: String, val b: Int)

::Class.curried() map
    Try { "hello" } ap
    Try { 3 } // Success(Class("hello", 3))

::Class.curried() map
    Try { "hello" } ap
    Try { "hi".toInt() } // Failure(NumberFormatException)
```

## Solution

<details><summary><strong>Reveal</strong></summary><p>

---
```kotlin
fun <A, B> Try<A>.apply(
    tryAB: Try<(A) -> B>): Try<B> =
    flatMap { a -> tryAB.map { it(a) } }

infix fun <A, B> ((A) -> B).map(aTry: Try<A>): Try<B> = aTry.map(this)

infix fun <A, B> Try<(A) -> B>.ap(aTry: Try<A>): Try<B> = aTry.apply(this)
```

</p></details>

---

Copyright © [FunctionalHub.com](http://functionalhub.com) 2018. All rights reserved.