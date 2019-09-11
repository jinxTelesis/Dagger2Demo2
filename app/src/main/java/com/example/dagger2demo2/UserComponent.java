package com.example.dagger2demo2;

import dagger.Component;

@UserScope
@Component(dependencies = AppComponent.class,modules = GitHubModule.class)
public class UserComponent {
    void inject(MainActivity mainActivity);
}
