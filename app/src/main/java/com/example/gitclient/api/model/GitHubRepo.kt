package com.example.gitclient.api.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class GitHubRepo {
    @SerializedName("name")
    @Expose
    val name: String? = null
}