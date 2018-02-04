// Copyright © FunctionalHub.com 2018. All rights reserved.

package functions.cps

data class FailureException(override val message: String): Exception(message)

fun performOperationCPS(any1: Any, any2: Any, any3: Any) {
}