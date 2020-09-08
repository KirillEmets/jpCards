package com.kirillemets.flashcards.review

data class ReviewCard(
    val word: String,
    val wordReading: String,
    val answer: String,
    val answerReading: String,
    val reversed: Boolean,
    val lastDelay: Int,
    val cardId: Int)