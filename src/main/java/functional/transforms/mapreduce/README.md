## Task

Your task is to implement a function that receives a list of `Movie` and returns the url of the largest box art.

If you want to use the provided tests the function must be called `getUrlOfLargestBoxArt` and must be inside the `functional.transforms.mapreduce` package.

## Input

Use the `moviesDemo` field inside [DataSource.kt](https://github.com/FunctionalKotlin/katas/tree/master/src/main/java/functional/transforms/DataSource.kt) file.

## Example

```kotlin
getUrlOfLargestBoxArt(moviesDemo) // a_place_in_the_cloud/Fracture300.jpg
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