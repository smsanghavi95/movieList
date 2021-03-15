package com.savan.movielistapp.api

import com.savan.movielistapp.data.Movie

//for the received response is a list so to store as a list
data class MovieResponse (
    val results: List<Movie>
        )