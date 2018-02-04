## Task

Your task is to implement a function that receives a list of `MovieList` (a list of lists of `Movie`) and returns a `List` containing the ids of the movies.

If you want to use the provided tests the function must be called `getAllMoviesIds` and must be inside the `functional.transforms.flatMap.simple` package.

## Input

Use the `movieListsDemo` field inside [DataSource.kt](https://github.com/FunctionalKotlin/katas/tree/master/src/main/java/functional/transforms/DataSource.kt) file.

## Example

```kotlin
getAllMoviesIds(movieListsDemo) // [70111470, 654356453, 65432445, 675465]
```

## Conditions

* Do not use any loops.

## Solution

<details><summary><strong>Reveal</strong></summary><p>

---
```kotlin
fun getAllMoviesIds(list: List<MovieList>): List<Int> = list.flatMap {
    it.movies
}.map {
    it.id
}
```

</p></details>

---

Copyright © [FunctionalHub.com](http://functionalhub.com) 2018. All rights reserved.