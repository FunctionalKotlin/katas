## Task

Your task is to implement a function that receives a list of `MovieList` (a list of lists of `Movie`) and returns a `List` containing a map with the following keys:

- For key `id` the movie's id.
- For key `title` the movie's title.
- For key `boxArt` the movie's 150x200 box art (if any).

If you want to use the provided tests the function must be called `getAllMoviesInformation` and must be inside the `functional.transforms.flatMap.advanced` package.

## Input

Use the `movieListsDemo` field inside [DataSource.kt](https://github.com/FunctionalKotlin/katas/tree/master/src/main/java/functional/transforms/DataSource.kt) file.

## Example

```kotlin
getAllMoviesInformation(movieListsDemo)

/*
[
    {
        id=70111470, 
        title=Die Hard, 
        boxArt=BoxArt(width=150, height=200, name=DieHard)
    },
    {
        id=654356453, 
        title=Bad Boys, 
        boxArt=BoxArt(width=150, height=200, name=BadBoys)
        },
    {
        id=65432445, 
        title=The Chamber, 
        boxArt=BoxArt(width=150, height=200, name=TheChamber)},
    {
        id=675465, 
        title=Fracture, 
        boxArt=BoxArt(width=150, height=200, name=Fracture)
    }
]
 */
```

## Conditions

* Do not use any loops.

## Solution

<details><summary><strong>Reveal</strong></summary><p>

---
```kotlin
fun getAllMoviesInformation(list: List<MovieList>): List<Map<String, Any?>> =
    list.flatMap {
        it.movies
    }.map {
        it.run {
            mapOf("id" to id, "title" to title, "boxArt" to boxArts.boxArt150())
        }
    }

private fun List<BoxArt>.boxArt150() = firstOrNull { it.width == 150 }
```

</p></details>

---

Copyright © [FunctionalHub.com](http://functionalhub.com) 2018. All rights reserved.