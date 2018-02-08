// Copyright © FunctionalHub.com 2018. All rights reserved.

import functional.transforms.BoxArt
import functional.transforms.Cast
import functional.abstractions.functor.PredicateException
import java.util.Random

fun ClosedRange<Int>.random() = Random().nextInt(endInclusive - start) + start

fun List<BoxArt>.boxArt150() = firstOrNull { it.width == 150 }

fun List<BoxArt>.biggestBoxArt(): BoxArt = reduce { acc, boxArt ->
    if (acc.area > boxArt.area) acc
    else boxArt
}

val BoxArt.area: Int
    get() = height * width

fun Cast.nameOfFirstActor(): String? = people.firstOrNull()
    ?.name
    ?.substringBefore(" ")

fun <A, B, C> ((A, B) -> C).curried(): (A) -> (B) -> C =
    { a -> { b -> this(a, b) } }

fun throwException(): String = throw PredicateException("Error")