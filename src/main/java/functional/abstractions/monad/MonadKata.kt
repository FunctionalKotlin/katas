package functional.abstractions.monad

import functional.abstractions.functor.Try

fun <A> Try<A>.flatMap(any: Any): Any = throw NotImplementedError()