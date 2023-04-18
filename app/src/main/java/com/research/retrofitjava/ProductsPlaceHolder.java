package com.research.retrofitjava;
import java.util.List;

import retrofit2.http.GET;
import retrofit2.Call;

public interface ProductsPlaceHolder {
    @GET("v1/d4867d8b-b5d5-4a48-a4ab-79131b5809b8")
    Call<List<Products>> getProducts();
}
