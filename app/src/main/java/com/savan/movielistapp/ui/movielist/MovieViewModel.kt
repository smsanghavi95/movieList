package com.savan.movielistapp.ui.movielist

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import androidx.paging.cachedIn
import com.savan.movielistapp.data.MovieRepository

/**
 * this is view model, here repository will be inject by dagger
 */
class MovieViewModel @ViewModelInject constructor(
    private val repository: MovieRepository
) : ViewModel() {

    private val currentQuery = MutableLiveData(DEFAULT_QUERY)

    val photos = currentQuery.switchMap { queryString ->
        repository.getSearchResults(queryString).cachedIn(viewModelScope)
    }

    companion object {
        private const val DEFAULT_QUERY = "popular"
    }
}