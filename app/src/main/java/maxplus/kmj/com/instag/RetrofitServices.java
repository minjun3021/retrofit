package maxplus.kmj.com.instag;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitServices {
    @GET("/hashtags/{key}")
    Call<Data> GETHashtags(@Path("key") String key);
}
