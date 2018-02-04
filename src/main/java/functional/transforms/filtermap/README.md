## Task

Your task is to implement a function that receives a list of `Movie` and returns a `List` containing the ids of the movies whose rating is `5.0`.

If you want to use the provided tests the function must be called `getFiveRatingMoviesIds` and must be inside the `functional.transforms.filtermap` package.

## Input

Use the `moviesDemo` field inside [DataSource.kt](https://github.com/FunctionalKotlin/katas/tree/master/src/main/java/functional/transforms/DataSource.kt) file.

## Example

```kotlin
getFiveRatingMoviesIds(moviesDemo) // [654356453, 675465]
```

## Conditions

* Do not use any loops.

## Solution

<details><summary><strong>Reveal</strong></summary><p>

---
```kotlin
fun getFiveRatingMoviesIds(movies: List<Movie>): List<Int> = movies.filter {
    it.rating == 5.0
}.map {
    it.id
}
```

</p></details>

---

Copyright © [FunctionalHub.com](http://functionalhub.com) 2018. All rights reserved.