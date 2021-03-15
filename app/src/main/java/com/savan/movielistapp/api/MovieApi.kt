package com.savan.movielistapp.api

import com.savan.movielistapp.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
//this is the retrofit api
interface MovieApi {

    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val CLIENT_ID = BuildConfig.MOVIE_KEY
    }
    /**
     *this will return the response from the endpoint
     * when we make a network request then it will take a moment so it is in a suspend function
     * this suspend function can be called from a suspend fun or co routine but that is taken care by paging3
     */

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey: String = CLIENT_ID,
        @Query("page") page: Int = 20
    ) : MovieResponse

}

