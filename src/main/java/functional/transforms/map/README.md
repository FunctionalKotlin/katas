## Task

Your task is to implement a function that receives a list of `Movie` and returns a `Map` where the keys are the movie ids and the values are the movie titles.

If you want to use the provided tests the function must be called `getMovies` and must be inside the `functional.transforms.map` package.

## Input

Use the `moviesDemo` field inside [DataSource.kt](https://github.com/FunctionalKotlin/katas/tree/master/src/main/java/functional/transforms/DataSource.kt) file.

## Example

```kotlin
getMovies(moviesDemo)

/*
{
    70111470=Die Hard, 
    654356453=Bad Boys, 
    65432445=The Chamber, 
    675465=Fracture
}
*/
```

## Conditions

* Do not use any loops.

## Solution

<details><summary><strong>Reveal</strong></summary><p>

---
```kotlin
fun getMovies(movies: List<Movie>): Map<Int, String> = movies.map {
    it.id to it.title
}.toMap()
```

</p></details>

---

Copyright © [FunctionalHub.com](http://functionalhub.com) 2018. All rights reserved.