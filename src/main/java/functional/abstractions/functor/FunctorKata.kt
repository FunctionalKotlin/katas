// Copyright © FunctionalHub.com 2018. All rights reserved.

package functional.abstractions.functor

data class PredicateException(override val message: String) : Exception(message)

typealias Failure<A> = Try.Failure<A>
typealias Success<A> = Try.Success<A>

sealed class Try<out A> {

    companion object {
        operator fun <A> invoke(f: () -> A): Try<A> = throw NotImplementedError()
    }

    class Success<out A>: Try<A>()
    class Failure<out A>: Try<A>()

}

fun <A> Try<A>.filter(any: Any): Any = throw NotImplementedError()

fun <A> Try<A>.fold(any1: Any, any2: Any): Any = throw NotImplementedError()

fun <A> Try<A>.get(): Any = throw NotImplementedError()

fun <A> Try<A>.isFailure(): Any = throw NotImplementedError()

fun <A> Try<A>.isSuccess(): Any = throw NotImplementedError()

fun <A> Try<A>.map(any: Any): Any = throw NotImplementedError()