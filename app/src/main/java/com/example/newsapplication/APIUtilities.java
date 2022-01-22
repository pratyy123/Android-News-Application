package com.example.newsapplication;



import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIUtilities {
    private static Retrofit retrofit=null;

    public static APIinterface getApiInterface() {

        {
            if(retrofit==null){
                retrofit=new Retrofit.Builder().baseUrl(APIinterface.BASE_URL).addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit.create(APIinterface.class);
        }
    }

}
