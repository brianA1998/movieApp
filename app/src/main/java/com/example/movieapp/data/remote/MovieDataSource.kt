package com.example.movieapp.data.remote

import com.example.movieapp.data.model.MovieList
import com.example.movieapp.repository.WebService
import com.example.movieapp.utils.AppConstants

class MovieDataSource(private val webService: WebService) {

    suspend fun getUpcomingMovies(): MovieList {
        return webService.getUpcomingMovies(AppConstants.API_KEY)
    }

    suspend fun getTopRatedMovies(): MovieList {
        return webService.getTopRatedMovies(AppConstants.API_KEY)
    }

    suspend fun getPopularMovies(): MovieList {
        return webService.getPopularMovies(AppConstants.API_KEY)
    }

}