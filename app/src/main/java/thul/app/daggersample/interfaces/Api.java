package thul.app.daggersample.interfaces;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import thul.app.daggersample.model.Hero;

public interface Api {

    String BASE_URL = "https://simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<Hero>> getHeroes();
}