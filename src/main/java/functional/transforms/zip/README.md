## Task

Your task is to implement a function that receives a list of `Movie` and a list of `Cast` and returns a map whose keys are the movie titles and the values are the movie first actor's name (not full name).

In order to use the `zip` function developers can assume the two lists contain information about the same movies, in the same order.

If you want to use the provided tests the function must be called `getFirstActorMap` and must be inside the `functional.transforms.zip` package.

## Input

Use the `moviesDemo` and `castsDemo` fields inside [DataSource.kt](https://github.com/FunctionalKotlin/katas/tree/master/src/main/java/functional/transforms/DataSource.kt) file.

## Example

```kotlin
getFirstActorMap(moviesDemo, castsDemo)
/*
    {
        Die Hard=Bruce, 
        Bad Boys=Will, 
        The Chamber=Gene, 
        Fracture=Ryan
    }
 */
```

## Conditions

* Do not use any loops.

## Solution

<details><summary><strong>Reveal</strong></summary><p>

---
```kotlin
fun getUrlOfLargestBoxArt(list: List<Movie>): String = list.flatMap {
    it.boxArts
}.biggestBoxArt().url

private fun List<BoxArt>.biggestBoxArt(): BoxArt = reduce { acc, boxArt ->
    if (acc.area > boxArt.area) acc
    else boxArt
}

private val BoxArt.area: Int
    get() = height * width
```

</p></details>

---

Copyright © [FunctionalHub.com](http://functionalhub.com) 2018. All rights reserved.