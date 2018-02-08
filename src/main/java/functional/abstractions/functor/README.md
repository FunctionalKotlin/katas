# Summary

In functional programming we can use lots of different types of error handling and reporting, which allows us to choose the best strategy for out situation.

- In one hand, we can use `Option` to model the absence of a value (like Kotlin's nullable)
- Or, for example, `Either` (same as course's `Result`) if we want to model our result as a type either successful or failure.
- On the other hand, we have `Try`, which represents an operation that can derive in a result (if it has been a success) or in an exception if something has failed.

Taking this into account we can the infer that there are only two possible implementation for `Try`, a `Success` `Try` and a `Failure` `Try`.

If we know that an operation could result in a failure, for example, because it is code from a library over which we have no control, or better yet, some method from the language itself. We can use Try as a substitute for the well-known try-catch, allowing us to rise to all its goodness.

# Task

Your task is to implement the `Try` type as a functor.

For that, you need to create it as a sealed class and implement two children: `Success` and `Failure`.

Also you need to be able to create `Try` instances out of the result of a lambda.

Then you will need to create the following methods for it:

- `filter`: It receives a predicate and returns a `Try` of the same type if the value contained matches the predicate.

- `fold`: Receives a function for handling both cases of the `Try`.

- `get`: Returns the value inside the `Try` or throws its error

- `isFailure`: Returns true if the `Try` is a `Failure`. 

- `isSuccess`: Returns true if the `Try` is a `Success`. 

And, of course, you must implement the `map` function that will add a functor instance to this type.

If you want to use the provided tests all this methods must be called as they are listed here and must be inside the `functional.abstractions.functor` package.

## Example

```kotlin
Try { "Test".toInt() }
    .filter { it > 5 }
    .map { it + 2 }
    .fold({
        exception -> "Error value"
    }, {
        value -> "The value is $value"
    }) // Error value
   
Try { "4".toInt() }
    .filter { it > 5 }
    .map { it + 2 } // PredicateException("Predicate does not hold for 4")
   
Try { "6".toInt() }
    .filter { it > 5 }
    .map { it + 2 } // Try.Success(8)    
```

## Solution

<details><summary><strong>Reveal</strong></summary><p>

---
```kotlin
data class PredicateException(override val message: String) : Exception(message)

typealias Failure<A> = Try.Failure<A>
typealias Success<A> = Try.Success<A>

sealed class Try<out A> {

    companion object {
        operator fun <A> invoke(f: () -> A): Try<A> =
            try {
                Success(f())
            } catch (t: Throwable) {
                Failure(t)
            }
    }

    data class Success<out A>(val value: A): Try<A>()
    data class Failure<out A>(val exception: Throwable): Try<A>()

}

fun <A> Try<A>.filter(predicate: (A) -> Boolean): Try<A> =
    fold({it -> Failure(it) }, {if (predicate(it)) Success(it)
    else Failure(PredicateException("Predicate does not hold for $it"))
    })

fun <A, B> Try<A>.fold(
    transformFailure: (Throwable) -> B, transformSuccess: (A) -> B): B =
        when(this) {
            is Failure -> transformFailure(exception)
            is Success -> try {
                transformSuccess(value)
            } catch (t: Throwable) {
                transformFailure(t)
            }
        }

fun <A> Try<A>.get(): A = fold({ throw it }, { it })

fun <A> Try<A>.isFailure(): Boolean = this is Failure

fun <A> Try<A>.isSuccess(): Boolean = this is Success

fun <A, B> Try<A>.map(transform: (A) -> B): Try<B> =
    fold({ Failure(it) }, { Success(transform(it)) })
```

</p></details>

---

Copyright © [FunctionalHub.com](http://functionalhub.com) 2018. All rights reserved.