package com.example.randomapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentViewModel : ViewModel() {
    val data = MutableLiveData<User>()

    fun setData(newData: User) {
        data.value = newData
    }
}