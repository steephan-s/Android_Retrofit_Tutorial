package testpress.testpress.com.todoapp;

/**
 * Created by steephan on 9/5/16.
 */
import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}