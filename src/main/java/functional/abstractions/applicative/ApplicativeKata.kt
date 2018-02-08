package functional.abstractions.applicative

import functional.abstractions.functor.Try
import functional.abstractions.functor.map
import functional.abstractions.monad.flatMap

fun <A> Try<A>.apply(any: Any): Any = throw NotImplementedError()

infix fun <A, B> ((A) -> B).map(any: Any): Any = throw NotImplementedError()

infix fun <A, B> Try<(A) -> B>.ap(any: Any): Any = throw NotImplementedError()
