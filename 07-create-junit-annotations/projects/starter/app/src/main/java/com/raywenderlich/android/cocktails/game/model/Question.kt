package com.raywenderlich.android.cocktails.game.model

class Question(val correctOption: String, incorrectOption: String) {
    var answeredOption : String? = null
        private set

    fun answer(option: String){
        answeredOption = option
    }
}