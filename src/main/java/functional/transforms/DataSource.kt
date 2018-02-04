// Copyright © FunctionalHub.com 2018. All rights reserved.

package functional.transforms

val moviesDemo: List<Movie> = listOf(
    Movie(70111470, "Die Hard", 4.0, listOf(
        InterestingMoment("End", 213432), InterestingMoment("Middle", 64534),
        InterestingMoment("Start", 323133))),
    Movie(654356453, "Bad Boys", 5.0, listOf(
        InterestingMoment("End", 54654754), InterestingMoment("Middle", 43524243),
        InterestingMoment("Start", 6575665))),
    Movie(65432445, "The Chamber", 4.0, listOf(
        InterestingMoment("End", 132423), InterestingMoment("Middle", 54637425),
        InterestingMoment("Start", 3452343))),
    Movie(675465, "Fracture", 5.0, listOf(
        InterestingMoment("End", 45632456), InterestingMoment("Middle", 234534),
        InterestingMoment("Start", 3453434)), listOf(150, 200, 300)))

val movieListsDemo: List<MovieList> = listOf(
    MovieList("New Releases", moviesDemo.subList(0, 2)),
    MovieList("Dramas", moviesDemo.subList(2, 4)))

val castsDemo: List<Cast> = listOf(
    Cast(70111470,
        listOf(Person("Bruce Willis", "John McClane"),
            Person("Alan Rickman", "Hans Gruber"))),
    Cast(654356453,
        listOf(Person("Will Smith", "Mike Lowrey"),
            Person("Martin Lawrence", "Marcus Burnett"))),
    Cast(65432445,
        listOf(Person("Gene Hackman", "Sam Cayhall"),
            Person("Chris O'Donnell", "Adam Hall"))),
    Cast(675465,
        listOf(Person("Ryan Gosling", "Willy Beachum"),
            Person("Anthony Hopkins", "Ted Crawford"))))
