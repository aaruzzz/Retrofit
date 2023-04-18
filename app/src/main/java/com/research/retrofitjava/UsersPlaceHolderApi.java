package com.research.retrofitjava;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.Call;


public interface UsersPlaceHolderApi {
    @GET("users")
    Call<Users> getUsers();
}
