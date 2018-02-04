// Copyright © FunctionalHub.com 2018. All rights reserved.

package functions.currying

fun add(x: Int, y: Int): Int = x + y

fun <A> ((A, A) -> A).curried(): (A) -> (A) -> A = { { it } }