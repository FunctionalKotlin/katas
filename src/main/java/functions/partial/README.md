# Task

Your task is to implement a partially applied version of the following data class constructor:

`data class Element(val type: String, val position: String, val id: Int)`

We want a partially applied function for elements of type "Blog" and position "Fixed", that allows us to create elements based on the element's id.

If you want to use the provided tests the function must be a variable called `partial` and must be inside the `functions.partial` package.

# Conditions

- You can't alter the `Element` data class nor directly nor via extension functions.
- You can't create a new function (with `fun`) to achieve the purpose of the kata.

## Solution

<details><summary><strong>Reveal</strong></summary><p>

---
```kotlin
val partial: (Int) -> Element = { Element("Blog", "Fixed", it) }
```

</p></details>

---

Copyright © [FunctionalHub.com](http://functionalhub.com) 2018. All rights reserved.