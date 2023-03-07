package com.example.randomapp

data class User(
    val firstname: String,
    val lastName: String,
    val sex: String,
    val age: String,
    val nationality: String,
    val id: String,
    val placeOfBirth: String,
    val placeOfResidence: String,
    val zip: String,
    val zodiac: String,
    val height: String,
    val weight: String
) {
    override fun toString(): String {
        return "$firstname $lastName $sex $age $nationality $id $placeOfBirth $placeOfResidence " +
            "$zip $zodiac $height $weight"
    }
}