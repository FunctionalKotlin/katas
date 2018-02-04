# Summary

In imperative programming is really typical to implement conditional paths using callbacks/listeners.
 
```kotlin
data class FailureException(override val message: String): Exception(message)

interface Listener {
    fun onSuccess(int: Int)
    fun onFailure(ex: FailureException)
}

fun performOperation(boolean: Boolean, listener: Listener) {
    if (boolean) listener.onSuccess(42)
    else listener.onFailure(FailureException("Error"))
}
```

# Task

Your task is to implement a function (similar to `performOperation`) but that uses CPS to manage both branches of the execution (success and failure) instead of a `Listener`.

As a bonus, you should implement this function so that instead of receiving a `Boolean` as the check of the computation, it should receive a function, that allows to lazily evaluate the check.

If you want to use the provided tests the function must be called `performOperationCPS` and must be inside the `functions.cps` package.

## Solution

<details><summary><strong>Reveal</strong></summary><p>

---
```kotlin
fun performOperationCPS(
    check: () -> Boolean,
    onSuccess: (Int) -> Unit,
    onError: (FailureException) -> Unit) {

    if (check()) onSuccess(42)
    else onError(FailureException("Error"))
}
```

</p></details>

---

Copyright © [FunctionalHub.com](http://functionalhub.com) 2018. All rights reserved.