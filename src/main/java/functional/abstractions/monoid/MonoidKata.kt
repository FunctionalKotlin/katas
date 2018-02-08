package functional.abstractions.monoid

import functional.abstractions.functor.Try

fun <A> Try<A>.plus(any1: Any, any2: Any): Any = throw NotImplementedError()