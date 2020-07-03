package io.github.ykws.retrofitdemo;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {
    @GET("users/{user}/repos")
    Single<List<Repo>> listRepos(@Path("user") String user);
}
