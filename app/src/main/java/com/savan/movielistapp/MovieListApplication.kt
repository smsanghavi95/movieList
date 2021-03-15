package com.savan.movielistapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * dagger needs application class
 * @HiltAndroidApp will do code generation which this library needs
 */
@HiltAndroidApp
class MovieListApplication: Application() {
}