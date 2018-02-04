// Copyright © FunctionalHub.com 2018. All rights reserved.

import functional.transforms.BoxArt
import functional.transforms.Cast
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