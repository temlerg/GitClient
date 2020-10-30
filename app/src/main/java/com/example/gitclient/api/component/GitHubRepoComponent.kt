package com.example.gitclient.api.component

import com.example.gitclient.api.modules.GitHubClientModule
import com.example.gitclient.api.scope.GitHubClientApplicationScope
import com.example.gitclient.api.service.GitHubClient
import dagger.Component

@GitHubClientApplicationScope
@Component(modules = [GitHubClientModule::class])
interface GitHubRepoComponent {
    fun getGitHubClientService(): GitHubClient
}