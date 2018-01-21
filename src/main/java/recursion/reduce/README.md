# Task

Implement `List.reduce` using recursion.

`reduce` behaves exactly likes `fold`, but instead of receiving an accumulator it uses the first element of the list as the initial value.

If you want to use the provided tests the function must be called `reduceKt` and must be inside the `recursion.reduce` package.

## Arguments

* operation: Function to use as the reduction step. Like the `List.reduce` `operation` parameter, it should be a function with the following type: `(A, A) -> A` where `A` is the type of the elements of the collection.

## Example

```kotlin
val list = listOf("functional", "hub", ".", "com")


list.reduceKt(String::plus) // "functionalhub.com" 
```

## Conditions

* Do not use any loops.
* Do not use any `List` methods like `fold` or `reduce` (but you can create them).

## Solution

<details><summary><strong>Reveal</strong></summary><p>

---
```kotlin
val <T> List<T>.split: Split<T>?
    get() = takeIf { count() > 0 }
        ?.let { Split(this.first(), subList(1, count())) }

data class Split<out T>(val head: T, val tail: List<T>)

tailrec fun <A, B> List<A>.fold(accumulator: B, operation: (B, A) -> B): B {
    val (head, tail) = split ?: return accumulator
    return tail.fold(operation(accumulator, head), operation)
}

fun <A> List<A>.reduceKt(operation: (acc: A, A) -> A): A = split?.let {
    (head, tail) -> tail.fold(head, operation)
} ?: throw UnsupportedOperationException("Empty list can't be reduced.")
```

</p></details>

---

Copyright © [FunctionalHub.com](http://functionalhub.com) 2018. All rights reserved.