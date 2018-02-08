# Task

Your task is to implement a monad for the `Try` type.

For that, you should create the method `flatMap`.

If you want to use the provided tests this method must be called `flatMap` and must be inside the `functional.abstractions.monad` package.

## Params

- `transform`: a function that takes an `A` and return a `Try<B>`

## Example

```kotlin
Try { "hi" }.flatMap {
    Try { "hello $it" }
} // Success("hello hi")

Try { "hi" }.flatMap {
    throw Exception()
} // Failure(Exception)
```

## Solution

<details><summary><strong>Reveal</strong></summary><p>

---
```kotlin
fun <A, B> Try<A>.flatMap(transform: (A) -> Try<B>): Try<B> =
    fold({Failure(it)}, {transform(it)})
```

</p></details>

---

Copyright © [FunctionalHub.com](http://functionalhub.com) 2018. All rights reserved.