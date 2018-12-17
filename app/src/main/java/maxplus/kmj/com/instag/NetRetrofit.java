package maxplus.kmj.com.instag;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetRetrofit {
    final static String url="http://18.191.231.70";
    final static int port=3000;

    private static Retrofit retrofit;
    public static RetrofitServices getInstance(){
        if(retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(url+":"+port)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(RetrofitServices.class);
    }
}
