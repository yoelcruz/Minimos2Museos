package com.vogella.android.minimodosmuseo.webservice;

import com.vogella.android.minimodosmuseo.models.Museums;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PartMap;
import retrofit2.http.Path;

public interface WebServiceClient {
    @GET("dataset/museus/format/json/pag-ini/{pagIni}/pag-fi/{pagFi}")
    Call<Museums> getElements(@Path("pagIni") String pag1, @Path("pagFi") String pag2);
}
