package com.example.myapplication;
import java.util.List;
import retrofit2.http.POST
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.Call;
public interface API {
    @POST("auth/login")
    Call<AuthParam>doAuth(@Body AuthParam authParam);
    @POST("auth/register")
    Call<RegParem> doReg(@Body RegParam RegParam);
    @GET("movies?Filter=new")
    Call<List<KinoParam>>getKino();
}
