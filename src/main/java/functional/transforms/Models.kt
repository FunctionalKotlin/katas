// Copyright © FunctionalHub.com 2018. All rights reserved.

package functional.transforms

data class Movie(
    val id: Int, val title: String, val rating: Double,
    val interestingMoments: List<InterestingMoment>,
    private val boxArtsWidths: List<Int> = listOf(150, 200)) {

    val boxArts: List<BoxArt> = boxArtsWidths.map {
        BoxArt(it, 200, title.replace(" ", ""))
    }
}

data class BoxArt(val width: Int, val height: Int, private val name: String) {
    val url = "a_place_in_the_cloud/$name$width.jpg"
}

data class InterestingMoment(val type: String, val time: Int)

data class Cast(val id: Int, val people: List<Person>)

data class Person(val name: String, val role: String)

data class MovieList(val name: String, val movies: List<Movie>)