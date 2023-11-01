package com.mkrdeveloper.viewmodeljetpack

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var number = 0
    fun incCount(){
        number++
    }
}