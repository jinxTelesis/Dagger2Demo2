package com.example.dagger2demo2;


import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;


@Module
public class GitHubModule {

    @Provides
    @UserScope
    public GitHubApiInterface providesGitHubInterface(Retrofit retrofit) {
        return retrofit.create(GitHubApiInterface.class);
    }
}
