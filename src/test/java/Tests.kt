// Copyright © FunctionalHub.com 2018. All rights reserved.

import io.kotlintest.matchers.shouldBe
import io.kotlintest.matchers.shouldThrow
import io.kotlintest.specs.FreeSpec
import recursion.reduce.reduceKt

class Tests : FreeSpec() {
    init {
        "1 - Recursion" - {
            "ReduceKata" - {
                "reduceKt with String::plus should join all strings" {
                    val list = listOf("functional", "hub", ".", "com")

                    val reduced = list.reduceKt(String::plus)

                    reduced shouldBe "functionalhub.com"
                }
                "reduceKt should calculate factorial" {
                    val factorial = (1..10).toList().reduceKt(Int::times)

                    factorial shouldBe 3628800
                }
                "reduceKt should fail if empty list" {
                    shouldThrow<UnsupportedOperationException> {
                        emptyList<String>().reduceKt(String::plus)
                    }
                }
            }
        }
    }
}
