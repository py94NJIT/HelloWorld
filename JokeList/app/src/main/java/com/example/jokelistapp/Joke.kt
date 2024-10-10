package com.example.jokelistapp
import com.google.gson.annotations.SerializedName

class Joke {
    @SerializedName("type")
    var type: String? = null

    @SerializedName("setup")
    var setup: String? = null

    @SerializedName("punchline")
    var punchline: String? = null
}