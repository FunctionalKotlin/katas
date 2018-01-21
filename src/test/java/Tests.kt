// Copyright © FunctionalHub.com 2018. All rights reserved.

import io.kotlintest.matchers.shouldBe
import io.kotlintest.matchers.shouldThrow
import io.kotlintest.specs.FreeSpec
import recursion.adding.multiplying.canReach
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
            "AddingMultiplyingKata" - {
                "canReach should work for certain combinations" {
                    canReach(59, 5, 7) shouldBe true
                    canReach(1, 5, 5) shouldBe true
                    canReach(10, 5, 3) shouldBe false
                    canReach(100, 1, 1) shouldBe true
                }
                "canReach should return same result as verified function" {
                    fun testCanReach(n: Int, add: Int, multiply: Int): Boolean =
                        if (n <= 1) {
                            n == 1
                        } else {
                            if (n % multiply == 0 && multiply > 1) {
                                testCanReach(n / multiply, add, multiply) ||
                                    testCanReach(n - add, add, multiply)
                            } else {
                                testCanReach(n - add, add, multiply)
                            }
                        }

                    (0..50).forEach {
                        val n = (1..2000).random()
                        val add = (1..20).random()
                        val multiply = (1..20).random()

                        canReach(n, add, multiply) shouldBe
                            testCanReach(n, add, multiply)
                    }

                }
            }
        }
    }
}
