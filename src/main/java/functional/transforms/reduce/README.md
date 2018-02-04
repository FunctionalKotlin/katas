## Task

Your task is to implement a function that receives a list of `Movie` and returns the largest rating.

If you want to use the provided tests the function must be called `getLargestRating` and must be inside the `functional.transforms.reduce` package.

## Input

Use the `moviesDemo` field inside [DataSource.kt](https://github.com/FunctionalKotlin/katas/tree/master/src/main/java/functional/transforms/DataSource.kt) file.

## Example

```kotlin
getLargestRating(moviesDemo) // 5.0
```

## Conditions

* Do not use any loops.

## Solution

<details><summary><strong>Reveal</strong></summary><p>

---
```kotlin
fun getLargestRating(list: List<Movie>): Double = list.reduce { acc, movie ->
    if (acc.rating > movie.rating) acc
    else movie
}.rating
```

</p></details>

---

Copyright © [FunctionalHub.com](http://functionalhub.com) 2018. All rights reserved.