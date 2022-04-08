package com.example.gamefragment.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private val userLiveData: MutableLiveData<User?>? = MutableLiveData<User?>()

    fun getUser(): LiveData<User?>? {
        return userLiveData
    }

    fun UserModel() {
        // trigger user load.
    }

    fun doAction() {
        // depending on the action, do necessary business logic calls and update the
        // userLiveData.
    }
}